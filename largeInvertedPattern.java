public class largeInvertedPattern {
    public static void main(String[] args) {
        for(int i = 9; i>=1;i=i-2){
            for(int j =i; j>=1; j--){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    
}
