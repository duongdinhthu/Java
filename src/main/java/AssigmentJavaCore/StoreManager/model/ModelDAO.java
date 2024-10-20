package AssigmentJavaCore.StoreManager.model;


import AssigmentJavaCore.StoreManager.entity.Entity;

import java.sql.SQLException;
import java.util.List;

public interface ModelDAO <T extends Entity<?>> {
    public int insert(Entity entity) throws SQLException, IllegalAccessException;
    public void insertAll(List entity) throws SQLException, IllegalAccessException;

    public boolean update(Entity entity) throws SQLException, IllegalAccessException;

    public boolean delete(Entity entity) throws IllegalAccessException, SQLException;

    public List getEntityByField(Entity entity) throws Exception;

    public List getAll(Class entityClass) throws Exception;

}
