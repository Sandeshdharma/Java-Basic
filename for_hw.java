import java.util.Scanner;

public class for_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for which times you want to print hello world");
        int number= sc.nextInt();
        for(int i=0; i< number; i++){
            System.out.println("hello world");

        }
    }
    
}
