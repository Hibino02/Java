package com.company;

public class Human
{
    private String name = "Hibino";

    public String getName()
    {
        return name;
    }

    public void Hello()
    {
        System.out.println("Hello"+name);
    }
    public static void hello(String FirstName, String LastName, Integer Age)
    {
        System.out.println("Hello "+FirstName +LastName +Age);
    }

}