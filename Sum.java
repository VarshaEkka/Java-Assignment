// 1. WRITE A PROGRAM TO FIND THE SUM OF TWO NUMBERS.
 
import java.util.*;

class UserInput 
{
    public static void main(String args[])
    {
        int a, b, sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");
        a = s.nextInt();
        b = s.nextInt();
        sum = a + b;
        System.out.println("Sum = " + sum);
        s.close();
    }
}
