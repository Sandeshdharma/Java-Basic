import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        if(N>0 ){
            System.out.println("positive");
        }else if(N<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }

    
}
