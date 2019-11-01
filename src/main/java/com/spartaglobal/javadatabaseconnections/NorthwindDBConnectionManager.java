package com.spartaglobal.javadatabaseconnections;

import com.spartaglobal.PropertiesManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NorthwindDBConnectionManager {

    private PropertiesManager props = new PropertiesManager();
    private final String CONNECTIONURL = "jdbc:sqlserver://localhost:1433;databaseName=northwind;user="+ props.getUsername() + ";password=" + props.getPassword();

    public Connection getNWDriverConnection() throws SQLException {
//        Statement statementObj = null;
//        try(Connection con = DriverManager.getConnection(CONNECTIONURL)){
//            statementObj = con.createStatement();
//        }catch(SQLException e)
//        {
//            e.printStackTrace();
//        }
//
//        return statementObj;

        return DriverManager.getConnection(CONNECTIONURL);
    }


}
