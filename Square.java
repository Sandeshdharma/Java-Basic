// : In a program, input the side of a square. You have to output the area of the
// square.
// (Hint : area of a square is (side x side))
import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of the square");
        int side= sc.nextInt();
         int area = side*side;

        System.out.println("area of square" + " " + area);
    }

    
}
