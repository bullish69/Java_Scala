import java.util.*;

public class Salary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee : ");
        String empname = s.nextLine();
        System.out.println("Enter Emp Id : ");
        int empno = s.nextInt();
        System.out.println("Enter Basic : ");
        int basic = s.nextInt();
        float da = basic * (70 / 100);
        float hra = basic * (30 / 100);
        float pf = basic * (10 / 100);
        int pt = 100;
        int cca = 240;
        float gross = (basic + hra + cca + da);
        float deduction = pt + pf;
        System.out.println("Gross Salary : " + gross);
        System.out.println("Net Salary : " + (gross + deduction));
    }
}