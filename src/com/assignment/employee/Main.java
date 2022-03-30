package com.assignment.employee;
//Jamoi Robinson
//Maxine Smith
//Johnathan Adams
//Ramoy Roberts

import java.io.File;
import java.io.IOException;

public class Main {

    //Function to add a space in between lines
    public static void displayLine()
    {
     System.out.println("*********************************");
    }

    public static void main(String args[])
    {
        //Create an Object of Invoice Class
        Invoice invObj1 = new Invoice();
        //Create an Object of SalariedEmployee Class
        SalariedEmployee salariedEmployeeObj1 = new SalariedEmployee();
        //Create an Object of HourlyEmployee Class
        HourlyEmployee hourlyEmployeeObj1 = new HourlyEmployee();
        //Create an Object of BasePlusCommissionEmployee
        BasePlusCommissionEmployee basePlusCommissionEmployeeObj1 = new BasePlusCommissionEmployee();
        //Create an Object of CommissionEmployee
        CommissionEmployee commissionEmployeeObj1 = new CommissionEmployee();

        //Calling the setter methods of Invoice Class
        invObj1.setPartDescription("XXXZ Speaker");
        invObj1.setPartNumber("12230");
        invObj1.setQuantity(10);
        invObj1.setPricePerItem(250.70);

        //Calling the setter methods of SalariedEmployee Class
        salariedEmployeeObj1.setSocialSecurityNumber("PZ0001");
        salariedEmployeeObj1.setWeeklySalary(17000.28);
        salariedEmployeeObj1.setLastName("Wilson");
        salariedEmployeeObj1.setFirstName("Slade");

        //Calling the setter methods of HourlyEmployee CLass
        hourlyEmployeeObj1.setSocialSecurityNumber("6640JF");
        hourlyEmployeeObj1.setHours(172);
        hourlyEmployeeObj1.setWage(879.20);
        hourlyEmployeeObj1.setLastName("Wayne");
        hourlyEmployeeObj1.setFirstName("Bruce");

        //Calling the setter methods of BasePlusCommissionEmployee Class
        basePlusCommissionEmployeeObj1.setSocialSecurityNumber("7772JK");
        basePlusCommissionEmployeeObj1.setBaseSalary(17000.28);
        basePlusCommissionEmployeeObj1.setCommissionRate(15.6);
        basePlusCommissionEmployeeObj1.setGrossSales(200.22);
        basePlusCommissionEmployeeObj1.setLastName("Kent");
        basePlusCommissionEmployeeObj1.setFirstName("Clark");

        //Calling the setter methods CommissionEmployee class
        commissionEmployeeObj1.setSocialSecurityNumber("JN4018");
        commissionEmployeeObj1.setCommissionRate(50.27);
        commissionEmployeeObj1.setGrossSales(175);
        commissionEmployeeObj1.setLastName("Grayson");
        commissionEmployeeObj1.setFirstName("Dick");


        //Writing to file info stored in various Class Variables/methods
        invObj1.writeToFile();
        displayLine();
        salariedEmployeeObj1.writeToFile();
        displayLine();
        hourlyEmployeeObj1.writeToFile();
        displayLine();
        basePlusCommissionEmployeeObj1.writeToFile();
        displayLine();
        commissionEmployeeObj1.writeToFile();

        displayLine();
        displayLine();
        System.out.println("Kindly open text Files in folder");
        displayLine();
        displayLine();

    }
}
