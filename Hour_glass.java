public class Hour_glass {
    public static void main(String[] args) {

        String s = "Rama";
        s += "Krishna";
        System.out.println(s);
        displayNextFiveChar('y');

        int n = 6;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }

    }

    public static void displayNextFiveChar(char chr) {
        for (int i = 0; i < 5; i++) {
            chr++;
            if (chr > 'z') {
                chr = 'A';
            } else if (chr > 'Z' && chr < 'a') {
                chr = 'a';
            }
            System.out.println(chr);
        }
    }
}
