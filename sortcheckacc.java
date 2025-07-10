import java.util.Scanner;

public class sortcheckacc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size :");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " th Element :");
            numbers[i] = sc.nextInt();
        }

        sc.close();

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                isDescending = false;
            } else if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order");
        } else {
            System.out.println("The array is  not sorted");
        }
    }
}
