import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Solution10 {
    public static void main(String[] args) {
        AtomicBoolean exitBlocked = new AtomicBoolean(false);
        
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            String s = Integer.toString(n);
            
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            if (exitBlocked.get()) {
                System.out.println("Unsuccessful Termination!!");
            } else {
                e.printStackTrace();
            }
        }
    }
}

class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1;
    }
    
    public static void forbidExit(AtomicBoolean exitBlocked) {
        exitBlocked.set(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (exitBlocked.get()) {
                throw new ExitTrappedException();
            }
        }));
    }
}