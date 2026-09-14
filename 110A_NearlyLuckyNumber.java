import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            int luckyCount = 0;

            for (char c : s.toCharArray()) {
                if (c == '4' || c == '7') {
                    luckyCount++;
                }
            }
            if (luckyCount == 4 || luckyCount == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
