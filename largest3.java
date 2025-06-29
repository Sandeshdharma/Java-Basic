import java.util.*;
public class largest3{
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  first number");
        int first= sc.nextInt();
        System.out.println("enter  second number");
        int second= sc.nextInt();
        System.out.println("enter  third number");
        int third= sc.nextInt();

        if(first>second && first> third){
            System.out.println("this is largest number" + first);

        }else if (second>first && second> third){
            System.out.println("this is largest " + second);

        }else
        {
            System.out.println("this is largest" + third);
        }





        
        

}


}