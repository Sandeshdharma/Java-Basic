import java.util.*;
public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int sqr= N*N;
            int sum =0;
            while(sqr!=0){

                int lastDigit=sqr%10;
                sum=sum+lastDigit;
                sqr/=10;


            }
            if(sum ==N){
                System.out.println("neon");
            }else{
                System.out.println("not a neon");
            }

       

        }
    }

    

