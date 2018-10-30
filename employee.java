import java.util.Scanner;
class Employee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic pay");
        int b_pay=sc.nextInt();
        double da=b_pay*(25/100.0);
        double hra=b_pay*(15/100.0);
        double pf=b_pay*(8.33/100.0);
        double net=b_pay+da+hra;
        double gross=net-pf;
        System.out.println("\nGross pay = Rs. "+gross);
    }
}
