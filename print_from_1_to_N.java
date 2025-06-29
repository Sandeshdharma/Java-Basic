import java.util.Scanner;

public class print_from_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("enter number till you want to print the series");

        int N = sc.nextInt();

        int counter = 1;
        while(counter<=N){
            System.out.println(counter);
            counter++;
        }

    }
    
}
