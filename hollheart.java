

public class hollheart {
    public static void main(String[] args) {
        int size = 6;

        // Top two semicircles
        for (int i = size / 2; i <= size; i += 2) {
            for (int j = 1; j < size - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 1; j <= size - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Inverted triangle
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < size - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j == 1 || j == (i * 2) - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
