public class parrtens {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                if (j % 2 != 0) {
                    System.out.print("*");

                } else {
                    System.out.print("#");
                }
                // System.out.println();
            }
            System.out.println();

        }
    }

}
