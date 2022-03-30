package com.assignment.employee;

import java.io.File;
import java.io.IOException;

//create class Employee and then implements interface Payable.
public class Employee implements Payable{
    //create private variables
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    //create a constructor of class employee
    public Employee(){};

    //create getter and setters for private employee variables
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //Implements method from interface
    @Override
    public double getPaymentAmount()
    {
        return 0;
    }

    @Override
    public void writeToFile()
    {
        try
        {
            File file = new File("Employee.txt");
            if(file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            }
            else
            {
                System.out.println("File already exist!");
            }
        }catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
