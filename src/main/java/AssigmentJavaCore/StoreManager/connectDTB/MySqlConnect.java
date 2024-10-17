package AssigmentJavaCore.StoreManager.connectDTB;

import java.sql.*;

public class MySqlConnect {

    public static Connection getMySQLConnection() throws SQLException {
        Connection conn = null;
        String hostName = "127.0.0.1";//127.0.1 hoac localhost
        String dbName = "AssigmentJavaCore";
        String userName = "root";
        String password = "";
        //String connection( chuoi ket noi )
        String connectionURL = "jdbc:mysql://"+hostName+":3306/"+dbName;
        conn = DriverManager.getConnection(connectionURL,userName,password);
        return conn;
    }

}
