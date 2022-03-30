package com.assignment.employee;

import java.io.FileWriter;
import java.io.IOException;

//create child class of Employee called BasePlusCommissionEmployee
public class BasePlusCommissionEmployee extends CommissionEmployee{

    //create private variables
    private double baseSalary;

    //create constructor
    public BasePlusCommissionEmployee(){};

    //create getters and setters
    public double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount()
    {
        return baseSalary+(super.getCommissionRate()*this.getGrossSales());
    }
    @Override
    public void writeToFile()
    {
        try {
            FileWriter file = new FileWriter("BasePlusCommission.txt");
            file.write("Commission + Base Payslip for: " + this.getFirstName() + " " + this.getLastName() +
                    "\nBase Salary: $" + this.baseSalary +
                    "\nCommission: $" + this.getCommissionRate() +
                    "\nTotal Salary: $" + this.getPaymentAmount() +
                    "\nSocial Security Number: " + this.getSocialSecurityNumber()
            );
            file.close();
            System.out.println("Salary plus commission Payslip saved!!");
        }catch (IOException e)
        {
            System.out.println("AN ERROR OCCURRED!");
        }

    }
}
