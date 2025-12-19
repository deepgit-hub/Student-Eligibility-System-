import java.lang.System;
import java.util.Scanner;
class student_eligibility_system
{
    public static void main(String args[])
    {
        int fine =0;
        boolean allow = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Attendence Percentage : ");
        int attendence = scan.nextInt();
        System.out.print("Enter how many days you came late to class : ");
        int late = scan.nextInt();
        if(late>3)
        {
            allow=false;
        }
        else if(late>0)
        {
        fine = late*100;
        }
        if(attendence<75)
        {
            System.out.print("Enter 0 if you have medical certificate or press 1 if you don't have : ");
            int medical=scan.nextInt();
            if(medical==0)
            {
                allow=true;
            }
            else if(medical!=1)
            {
                allow=false;
            }

            else if(medical!=1 || medical!=0)
            {
                System.out.print("Invalid Input Entered!!!");
                allow=false;
            }
        }
        if(allow)
        {
            if(fine==0)
            {
                System.out.print("You are allowed to write exam All the best!!!");
            }
            else if(fine>0)
            {
                System.out.print("You are allowed to write exam with the fine "+fine);
            }
        }
        else
        {
            System.out.print("You are not allowed to write exam!!!");
        }
    }
}