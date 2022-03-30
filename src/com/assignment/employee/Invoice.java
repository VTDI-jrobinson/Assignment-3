package com.assignment.employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Create class that implements interface Payable
public class Invoice implements Payable
{

    //create private variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    //create class constructor
    public Invoice(){};

    //create getter and setters for private variables
    public String getPartNumber()
    {
        return partNumber;
    }

    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getPartDescription()
    {
        return partDescription;
    }

    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPricePerItem()
    {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }

    //implements methods from interface payable
    @Override
    public double getPaymentAmount()
    {
        return this.quantity*this.pricePerItem;
    }

    @Override
    public void writeToFile()
    {
        try {
            FileWriter file = new FileWriter("Invoice.txt");
            file.write("Your Invoice:\n" +
                    "Quantity: " + this.quantity +
                    "\nPart Number: " + this.partNumber +
                    "\nPrice Per Item: $" + this.pricePerItem +
                    "\nDescription: " + this.partDescription +
                    "\nTotal: $" + getPaymentAmount()
            );
            file.close();
            System.out.println("Invoice saved successfully");
        }catch(IOException e)
        {
            System.out.println("AN ERROR OCCURRED");
            e.printStackTrace();
        }
    }
}
