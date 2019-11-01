package com.spartaglobal.javadatabaseconnections;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeOverSixty {
    private NorthwindDBConnectionManager nwConn = new NorthwindDBConnectionManager();

    public List<String> getEmployeeLIst(){
        final String SQL = "SELECT FirstName + ' ' + LastName AS 'Full Name', DATEDIFF(d, BirthDate, GETDATE() )/365 AS 'Age' FROM Employees WHERE DATEDIFF(d, BirthDate, GETDATE() )/365 > 60";
        List<String> employeeList = new ArrayList<>();

        try(Statement stmt = nwConn.getNWDriverConnection().createStatement())
        {
            ResultSet resultSet = stmt.executeQuery(SQL);
            while(resultSet.next())
            {
                employeeList.add(resultSet.getString("Full Name")+ " " + resultSet.getString("Age"));
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return employeeList;
    }


}
