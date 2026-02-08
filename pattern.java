public class pattern {
    public static void main(String[] args) {
        /* ========= USING WHILE LOOP (Square) ========= */
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }


        System.out.println(); // space between shapes


        /* ========= USING FOR LOOP (Centered Triangle / Pyramid) ========= */

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}