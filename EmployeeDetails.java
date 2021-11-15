package com.edyodaassg.Assgn05;
import java.util.Scanner;

public class EmployeeDetails
{
    public static class employee
    {
        int empid;
        String name;
        float salary;
        int DOB;
        int join_date;

        public void getInput() {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter the empid :: ");
            empid = in.nextInt();
            System.out.print("Enter the name :: ");
            name = in.next();
            System.out.print("Enter the salary :: ");
            salary = in.nextFloat();
            System.out.print("Enter the DOB :: ");
            DOB = in.nextInt();
            System.out.print("Enter the Date of Joining :: ");
            join_date = in.nextInt();
        }

        public void display()
        {
            System.out.println("Employee id = " + empid);
            System.out.println("Employee name = " + name);
            System.out.println("Employee salary = " + salary);
            System.out.println("Employee DOB = " + DOB);
            System.out.println("Employee Date of Joining = " + join_date);
        }

        public void main(String[] args)
        {
            employee emp[] = new employee[5];

            for(int i=0; i<5; i++)
            {
                emp[i] = new employee();
                emp[i].getInput();
            }

            System.out.println("**** Data Entered as below ****");

            for(int i=0; i<5; i++) {

                emp[i].display();
            }
        }
    }
}
