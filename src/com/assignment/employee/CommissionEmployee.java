package com.assignment.employee;

import java.io.FileWriter;
import java.io.IOException;

//create child class of Employee called CommissionEmployee
public class CommissionEmployee extends Employee{

    //create private variables
    private double grossSales;
    private double commissionRate;

    //create constructor
    public CommissionEmployee(){};

    //create getters and setters for child class
    public double getGrossSales()
    {
        return grossSales;
    }

    public void setGrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    @Override
    public double getPaymentAmount()
    {
        return grossSales*commissionRate;
    }
    @Override
    public void writeToFile()
    {
        try {
            FileWriter file = new FileWriter("Commission.txt");
            file.write("Commission for: " + this.getFirstName() + " " + this.getLastName() +
                    "\nCommission: $" + this.getCommissionRate() +
                    "\nTotal Salary: $" + this.getPaymentAmount() +
                    "\nSocial Security Number: " + this.getSocialSecurityNumber()
            );
            file.close();
            System.out.println("Commission Payslip saved!!");
        }catch (IOException e)
        {
            System.out.println("AN ERROR OCCURRED!");
        }
    }
}
