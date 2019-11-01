package com.spartaglobal.javadatabaseconnections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        NWEmployeeDAO jdbExample = new NWEmployeeDAO();
//        System.out.println(jdbExample.getTotalNumberOfEmployeesV1());
//        PropertiesManager props = new PropertiesManager();
//        System.out.println(props.getUsername());
        EmployeeOverSixty employeeOverSixty = new EmployeeOverSixty();
        System.out.println(employeeOverSixty.getEmployeeLIst());

    }
}
