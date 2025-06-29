import java.util.Scanner;

public class sum_n_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int number = sc.nextInt();

          int sum=0;
        while(number>0){
            sum=sum+number;
            number--;
       

        }
        System.out.println("here is total sum "  + sum);
    }
    
}
