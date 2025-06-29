// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;
public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the cost of the pencil");
        float costOfPencil = sc.nextFloat();
        System.out.println("enter the cost of the pen");
        float costOfPen= sc.nextFloat();
        System.out.println("enter the cost  of the eraser");
        float costOfErasser = sc.nextFloat();


        float Total_Bill = (costOfPencil+costOfPen+costOfErasser);
        System.err.println("total bill" + Total_Bill);

        float gst = Total_Bill*18/100;
        System.out.println("gst amount " + gst);

        float final_bill = Total_Bill+gst;

        System.out.println("amount payable" + final_bill);

        




    }

    
}
