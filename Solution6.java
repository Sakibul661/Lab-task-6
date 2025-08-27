import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int)(Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

