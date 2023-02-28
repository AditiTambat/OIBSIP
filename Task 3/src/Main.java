package com.company;
import java.util.Scanner;

class Main {
    public static void main(String args[] )
    {
        int id = 001; int pin = 2710; int balance = 500000, withdraw, deposit, transfer;

        Scanner sc = new Scanner(System.in);
        System.out.println("******* WELCOME *******");
        System.out.println("Enter your ID:");
        int ID = sc.nextInt();
        while(ID != id)
        {
            System.out.println("Incorrect ID:");
            System.out.println("Please Try Again: ");
            ID = sc.nextInt();
        }
        System.out.println(" Enter pin :");
        int entry = sc.nextInt();
        while(entry != pin)
        {
            System.out.println("*** Incorrect PIN *** ");
            System.out.println("*** Please Try Again ***");
            entry = sc.nextInt();
        }

        while(true)
        {
            System.out.println("*** Welcome to ATM Interface ***");
            System.out.println("select 1 for Withdraw");
            System.out.println("select 2 for Deposit");
            System.out.println("select 3 for Transfer the Money");
            System.out.println("select 4 for Check Balance");
            System.out.println("select 5 for QUIT");
            System.out.print("select the option you want to perform:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();

                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance !!!");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:

                    System.out.print("Enter money to be Transfer:");

                    transfer= sc.nextInt();

                    transfer = balance - transfer;
                    System.out.println("Your Money has been successfully Transfer");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 5:
                    System.out.println(" ********** THANK YOU ********** ");
                    System.exit(0);
            }
        }
    }
}