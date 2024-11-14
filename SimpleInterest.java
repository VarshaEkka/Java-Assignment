// 3. TO DETERMINE THE SIMPLE INTEREST OF A GIVEN AMOUNT OF MONEY AT A GIVEN RATE OF INTEREST FOR A GIVEN PERIOD IN YEARS.

import java.util.*;

class SimpleInterest 
{
    public static void main(String args[]) 
    {
        int p, r, t, si;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        p = s.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        r = s.nextInt();
        System.out.println("Enter the Time Period: ");
        t = s.nextInt();
        si = p * r * t / 100;
        System.out.println("Simple Interest = " + si);
        s.close();
    }
}
