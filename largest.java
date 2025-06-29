import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  first number");
        int first_number = sc.nextInt();
        System.out.println("enter   second  number");
        int second_number = sc.nextInt();
        if(first_number> second_number){
            System.out.println(" this is largest" + first_number);

        }else{
            System.out.println(" thia ia largest " + second_number);
        }
    }
    
}
