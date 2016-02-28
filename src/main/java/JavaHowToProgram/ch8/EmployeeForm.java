package main.java.JavaHowToProgram.ch8;

import javax.swing.*;
import javax.swing.text.StringContent;

public class EmployeeForm extends JFrame
{
    private static int count = 0;
    private String firstName;
    private String lastName;

    public EmployeeForm(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }
}
