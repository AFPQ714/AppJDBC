package org.example.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionCore {

    public Connection getConection(){
        // atributes
        String hostname = "localhost";
        String port = "3306";
        String dbName = "restaurant_management_db";
        String userName = "root";
        String password = "seguridad23";

        // process

        // load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // url connection
            String url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;

            return DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            System.out.println("connectionCoreError:" + e.getMessage());
        }

        return null;
    }

}
