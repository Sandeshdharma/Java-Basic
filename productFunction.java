public class productFunction {


    public static int Product(int a, int c){
        // int a = 10;
        // int c = 45;
        int pro = a * c;
     
        return pro;

    }
    public static void main(String[] args) {
        int a = 10;
        int c = 45;
         int prod= Product(a , c); 
         System.out.println("a*b =" + prod  );
       

    }
    
}
