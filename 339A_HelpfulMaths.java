import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            String[] numbers = s.split("\\+");
            
            Arrays.sort(numbers);
            
            System.out.println(String.join("+", numbers));
        }
        sc.close();
    }
}
