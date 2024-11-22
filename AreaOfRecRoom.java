//4. TO DETERMINE THE AREA OF THE WALLS OF A RECTANGULAR ROOM AND HENCE THE COST OF ITS PAINTING ON THE BASIS OF CHARGE PER SQUARE UNIT.

import java.util.*;
class AreaOfRecRoom {
    public static void main(String[] args) {
        float h, a, l, b, cost, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the wall: ");
        l = sc.nextFloat();
        b = sc.nextFloat();
        h = sc.nextFloat();
        System.out.println("Enter the cost per unit: ");
        cost = sc.nextFloat();
        a = (2 * (l + b) * h);
        total = a * cost;
        System.out.println("The area of rectangular walls: " + a);
        System.out.println("Cost of painting the room: " + total);;
        sc.close();
    }
}