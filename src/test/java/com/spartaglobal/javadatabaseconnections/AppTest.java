package com.spartaglobal.javadatabaseconnections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private EmployeeOverSixty employeeOverSixty = new EmployeeOverSixty();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testEmployeeAge()
    {
        List<String> expected = new ArrayList<>();
        expected.add("Nancy Davolio 70");
        expected.add("Andrew Fuller 67");
        expected.add("Margaret Peacock 82");
        expected.add("Steven Buchanan 64");
        expected.add("Laura Callahan 61");
        Assert.assertEquals(expected, employeeOverSixty.getEmployeeLIst() );
    }

}
