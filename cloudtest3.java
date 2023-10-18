package ab;
import java.util.*;

public class cloudtest3 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input String: ");
        String s = sc.nextLine();
        int[] check = new int[26];
        String str = s.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 36 && str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                check[str.charAt(i) - 97] = 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (check[i] != 1) {
                System.out.println("Not Pangram");
                System.exit(0);
            }
        }
        System.out.println("Pangram");
    }
}
