public class binToDec {
    public static void Binarytodecimal(int binNum){
        int pow = 0;
        int binNum = 0;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2 , pow));
            pow++;
            binNum = binNum/10;

        }
        System.out.println("decimal of " + binNum  +" =" +decNum);

    }
    System.out.println("decimal of " +binNum +" =" +decNum);


    
}
public static void main(String args[]){
    Binarytodecimal(101);
}





