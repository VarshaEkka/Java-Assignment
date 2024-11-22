//5. WRITE A PROGRAM TO DETERMINE THE AREA OF A PARALLELOGRAM.

import java.util.*;

class parallelogram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the parallelogram: ");
        double height = sc.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is: " + area);
        sc.close();
    }
}
