package com.assignment.employee;

import java.io.FileWriter;
import java.io.IOException;

//create child class of Employee called HourlyEmployee
public class HourlyEmployee extends Employee{

    //Create Variables
    private double wage;
    private double hours;

    //Create Constructor
    public HourlyEmployee(){};

    //create getter and setters
    public double getWage()
    {
        return wage;
    }

    public void setWage(double wage)
    {
        this.wage = wage;
    }

    public double getHours()
    {
        return hours;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount()
    {
        return wage * hours;
    }
    @Override
    public void writeToFile()
    {

            try {
                FileWriter file = new FileWriter("Hourly Employee.txt");
                file.write("Hourly Payslip for: " + this.getFirstName() + " " + this.getLastName() +
                        "\nWage: $" + this.wage +
                        "\nHours Worked: " + this.hours +
                        "\nTotal wage: $" + this.getPaymentAmount() +
                        "\nSocial Security Number: " + this.getSocialSecurityNumber()
                );
                file.close();
                System.out.println("Hourly wage Payslip saved!!");
            }catch (IOException e)
            {
                System.out.println("AN ERROR OCCURRED!");
            }

    }
}
