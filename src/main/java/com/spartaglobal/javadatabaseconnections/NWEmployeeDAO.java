package com.spartaglobal.javadatabaseconnections;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO database access object
public class NWEmployeeDAO {

    private NorthwindDBConnectionManager nwConn = new NorthwindDBConnectionManager();

    public void iterateThroughEmployee(){
        try (Statement stmt = nwConn.getNWDriverConnection().createStatement()){
            final String SQL = "SELECT TOP 10 * FROM Employees";
            ResultSet results = stmt.executeQuery(SQL);
            while (results.next())
            {
                System.out.println(results.getString("firstName") + " " + results.getString("lastName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<String> getEmployeeList(){
        final String SQL = "SELECT TOP 10 * FROM Employees";
        List<String> employeeNames = new ArrayList<>();

        try(Statement stmt = nwConn.getNWDriverConnection().createStatement())
        {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next())
            {
                employeeNames.add(resultSet.getString("firstName") + " " + resultSet.getString("lastName"));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return employeeNames;

    }

    public int getTotalNumOfEmployees()
    {
        return getEmployeeList().size();
    }



    public int getTotalNumberOfEmployeesV1(){
        int employeeNum = 0;
        final String SQL = "SELECT COUNT(*) AS 'Total' FROM Employees";
        try(Statement stmt = nwConn.getNWDriverConnection().createStatement())
        {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next())
            {
                employeeNum = resultSet.getInt("Total");
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return employeeNum;
    }


}
