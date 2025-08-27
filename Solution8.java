import java.util.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNumber = 1;

        while (input.hasNext()) {   
            String line = input.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        input.close();
    }
}
