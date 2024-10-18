package AssigmentJavaCore.StoreManager.model;

import AssigmentJavaCore.StoreManager.connectDTB.MySqlConnect;
import AssigmentJavaCore.StoreManager.entity.Entity;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.*;


public class Model<T extends Entity<?>> implements ModelDAO {
    private List<T> entities = new ArrayList<>();// T dai dien cho cac thuc the entity( Product, Customer....)
    public static Connection connection;

    public static Connection openConnection() throws SQLException {
        connection = MySqlConnect.getMySQLConnection();
        return connection;
    }

    public static PreparedStatement pstm;


    public static PreparedStatement openPstm(String query) throws SQLException {
        pstm = openConnection().prepareStatement(query);
        return pstm;
    }

    public static boolean exUpdate() throws SQLException {
        int check = pstm.executeUpdate();
        return check > 0;
    }

    public static ResultSet exQuery() throws SQLException {
        ResultSet rs = pstm.executeQuery();
        return rs;
    }

    private String getTableName(Class<T> entityClass) {
        String tableName = entityClass.getSimpleName();
        return tableName;
    }

    private String getTableName(Entity entity) {
        String tableName = entity.getClass().getSimpleName();
        return tableName;
    }

    private StringBuilder queryInsert(Entity entity) {
        String tableName = getTableName((Class<T>) entity.getClass());
        StringBuilder query = new StringBuilder("insert into ");
        query.append(tableName).append(" (");
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                query.append(", ");
            }
            query.append(fields[i].getName());
        }
        query.append(") values (");
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                query.append(", ");
            }
            query.append("?");
        }
        query.append(")");
        return query;
    }

    private StringBuilder queryUpdate(Entity entity) {
        String tableName = getTableName((Class<T>) entity.getClass());
        StringBuilder query = new StringBuilder("update ");
        query.append(tableName).append(" set ");
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 1; i < fields.length; i++) {
            if (i > 1) {
                query.append(", ");
            }
            query.append(fields[i].getName()).append(" = ?");
        }
        query.append(" where ").append(fields[0].getName()).append(" = ?");
        return query;
    }

    private StringBuilder queryDelete(Entity entity) {
        String tableName = getTableName((Class<T>) entity.getClass());
        StringBuilder query = new StringBuilder("delete from ");
        query.append(tableName).append(" where ");
        Field[] fields = entity.getClass().getDeclaredFields();
        query.append(fields[0].getName()).append(" = ?");
        return query;
    }

    private StringBuilder queryGetAll(Class<T> entityClass) {
        String tableName = getTableName(entityClass);
        StringBuilder query = new StringBuilder("select * from ");
        query.append(tableName);
        return query;
    }

    private StringBuilder queryGetEntityByField(Entity entity) {
        String tableName = getTableName((Class<T>) entity.getClass());
        StringBuilder query = new StringBuilder("select * from ");
        query.append(tableName).append(" where ");

        Field[] fields = entity.getClass().getDeclaredFields();
        boolean foundField = false; // Biến để xác định xem trường nào có giá trị không

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(entity);
                // Kiểm tra giá trị trường có hợp lệ: không phải null hoặc "0"
                if (value != null && !"0".equals(value.toString())) {

                    // Nếu đã tìm thấy trường trước đó, thêm "and" trước khi thêm trường tiếp theo
                    if (foundField) {
                        query.append(" and ");
                    }
                    query.append(field.getName()).append(" = ?");
                    foundField = true; // Đánh dấu rằng đã tìm thấy trường có giá trị
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace(); // Xử lý exception theo cách phù hợp
            }
        }

        if (!foundField) {
            // Xử lý trường hợp không tìm thấy trường có giá trị
            // Ví dụ: Ghi log, throw exception, hoặc thực hiện hành động khác
            System.out.println("Không có trường nào có giá trị hợp lệ.");
        }

        return query;
    }



    @Override
    public int insert(Entity entity) throws SQLException, IllegalAccessException {
        Field[] fields = entity.getClass().getDeclaredFields();
        String query = queryInsert(entity).toString();
        PreparedStatement preparedStatement = openConnection().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        int parameterIndex = 1;
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(entity);
            preparedStatement.setObject(parameterIndex++, value);
        }

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int generatedKey = generatedKeys.getInt(1);
                return generatedKey;
            } else {
                throw new SQLException("Creating record failed, no ID obtained.");
            }
        } else {
            throw new SQLException("Creating record failed, no rows affected.");
        }
    }

    @Override
    public void insertAll(List entity) throws SQLException, IllegalAccessException {
        List<Entity> entityList = entity;
        for (Entity entity1 : entityList) {
            Field[] fields = entity1.getClass().getDeclaredFields();
            String query = queryInsert(entity1).toString();
            pstm = openPstm(query);
            int parameterIndex = 1;
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(entity1);
                pstm.setObject(parameterIndex++, value);
            }
            pstm.addBatch();
        }
        pstm.executeUpdate();
    }

    @Override
    public boolean update(Entity entity) throws SQLException, IllegalAccessException {
        Field[] fields = entity.getClass().getDeclaredFields();
        String query = queryUpdate(entity).toString();
        System.out.println(query);
        pstm = openPstm(query);
        for (int i = 1; i < fields.length; i++) {
            fields[i].setAccessible(true);
            Object value = fields[i].get(entity);
            pstm.setObject(i, value);
        }
        fields[0].setAccessible(true);
        Object value1 = fields[0].get(entity);
        pstm.setObject(fields.length, value1);
        boolean rowsUpdated = exUpdate();
        System.out.println(rowsUpdated);
        return rowsUpdated;
    }

    @Override
    public boolean delete(Entity entity) throws IllegalAccessException, SQLException {
        String query = queryDelete(entity).toString();
        System.out.println(query);
        pstm = openPstm(query);
        Field[] fields = entity.getClass().getDeclaredFields();
        fields[0].setAccessible(true);
        Object value = fields[0].get(entity);
        System.out.println(value);
        pstm.setObject(1, value);
        boolean rowsUpdated = exUpdate();
        return rowsUpdated;
    }

    @Override
    public List<T> getAll(Class entityClass) throws Exception {
        List<T> entities = new ArrayList<>();
        String query = queryGetAll(entityClass).toString();
        System.out.println(query);
        pstm = openPstm(query);
        ResultSet rs = exQuery();
        while (rs.next()) {
            T newEntity = (T) createEntityFromResultSet(rs, entityClass);


            entities.add(newEntity);
        }
        String method = "getAll_";
        Scanner input = new Scanner(System.in);
        System.out.print("Bạn có muốn lưu dữ liệu vào file json? (y/n): ");
        String confirmation = input.nextLine();
        if (confirmation.equalsIgnoreCase("y")) {
            entityToJSON.writeEmployeeToJson(entities, entityClass, method);
        } else {
            System.out.println("Hành động không được thực hiện.");
        }

        return entities;
    }


    private T createEntityFromResultSet(ResultSet rs, Class<T> entityClass) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T newEntity = entityClass.getDeclaredConstructor().newInstance();
        Field[] fields = entityClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = rs.getObject(field.getName());
            field.set(newEntity, value);
        }
        return newEntity;
    }

    EntityToJSON entityToJSON = new EntityToJSON();

    @Override
    public List<T> getEntityByField(Entity entity) throws Exception {
        List<T> entityList = new ArrayList<>();
        String query = queryGetEntityByField(entity).toString();
        System.out.println("SQL Query: " + query);

        try (Connection connection = openConnection();
             PreparedStatement pstm = openPstm(query)) {

            Field[] fields = entity.getClass().getDeclaredFields();
            List<Field> validFields = new ArrayList<>();

            // Lọc các trường hợp có giá trị hợp lệ
            for (Field f : fields) {
                f.setAccessible(true);
                Object val = f.get(entity);
                if (val != null && !"0".equals(val.toString())) {
                    validFields.add(f);
                }
            }

            // Đặt các giá trị vào PreparedStatement
            int index = 1;
            for (Field f : validFields) {
                Object val = f.get(entity);
                pstm.setObject(index, val);
                index++;
            }

            // Thực hiện query
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs == null) {
                    throw new SQLException("ResultSet is null");
                }

                ResultSetMetaData metaData = rs.getMetaData();
                if (metaData == null) {
                    throw new SQLException("ResultSetMetaData is null");
                }

                System.out.println("Column Count: " + metaData.getColumnCount());
                while (rs.next()) {
                    T newEntity = (T) entity.getClass().newInstance();
                    for (int i = 1; i <= metaData.getColumnCount(); i++) {
                        String columnName = metaData.getColumnName(i);
                        for (Field field : fields) {
                            field.setAccessible(true);
                            if (field.getName().equals(columnName)) {
                                Object fieldValue = rs.getObject(i);
                                if (fieldValue == null && field.getType().isPrimitive()) {
                                    continue;
                                }
                                field.set(newEntity, fieldValue);
                                break;
                            }
                        }
                    }
                    System.out.println(newEntity.toString());
                    entityList.add(newEntity);
                    System.out.println(newEntity.getClass().getMethod("getCustomer_id").invoke(newEntity));
                }
            }
        }

        // Yêu cầu người dùng lưu dữ liệu vào file JSON
        String method = null;
        Entity entity1 = entityList.get(0);
        try {
            method = "getId_" + entity1.getClass().getMethod("getCustomer_id").invoke(entity1) + "_";
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Bạn có muốn lưu dữ liệu vào file json? (y/n): ");
        String confirmation = input.nextLine();


        if (confirmation.equalsIgnoreCase("y")) {
            entityToJSON.writeEmployeeToJson(entityList, entity.getClass(), method.toString());
        } else {
            System.out.println("Hành động không được thực hiện.");
        }

        return entityList;
    }

}

