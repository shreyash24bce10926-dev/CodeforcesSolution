import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();
            
            int comparison = first.compareTo(second);
            
            if (comparison < 0) {
                System.out.println(-1);
            } else if (comparison > 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
