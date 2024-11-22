
//6. TO DETERMINE THE STOCK VALUE OF A STORE OF CERTAIN ITEM ON THE BASIS OF ITS UNIT COST AND QUANTITIES HELD IN THE STOCK.

import java.util.*;

class stock {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit cost of the item");
        double unitcost = sc.nextDouble();
        System.out.println("Enter the quantity in stock: ");
        int quantity = sc.nextInt();
        double stockValue = unitcost * quantity;
        System.out.println("The stock value is: $" + stockValue);
        sc.close();
    }
}
