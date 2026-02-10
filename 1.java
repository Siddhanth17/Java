class Pattern5 {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) {

            for (int s = 4 - i; s > 0; s--)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
