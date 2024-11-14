// 2. WRITE A PROGRAM TO FIND THE PRODUCT AND AVERAGE OF TWO NUMBERS.

import java.util.*;

class ProdAvg 
{
    public static void main(String args[])
    {
        int a, b, prod, avg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");
        a = s.nextInt();
        b = s.nextInt();
        prod = a * b;
        avg = (a + b) / 2;
        System.out.println("Product = " + prod + "\nAverage = " + avg);
        s.close();
    }
}
