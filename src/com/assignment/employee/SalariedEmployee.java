package com.assignment.employee;

import java.io.FileWriter;
import java.io.IOException;

//Create class that inherits from employee class
public class SalariedEmployee extends Employee{
    //create private variable
    private double weeklySalary;

    //create public constructor for child class
    public SalariedEmployee(){};

    //Create getter and Setter for private variable
    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    //Implements methods from interface payable
    @Override
    public double getPaymentAmount()
    {
        return weeklySalary;
    }
    @Override
    public void writeToFile()
    {
        try {
                FileWriter file = new FileWriter("Salaried Employee.txt");
                file.write("Salary Payslip for: " + this.getFirstName() + " " + this.getLastName() +
                    "\nWeekly Salary: $" + this.weeklySalary +
                    "\nSocial Security Number: " + this.getSocialSecurityNumber()
            );
            file.close();
            System.out.println("Salary pay-slip saved!!");
        }catch (IOException e)
        {
            System.out.println("AN ERROR OCCURRED!");
        }
    }
}
