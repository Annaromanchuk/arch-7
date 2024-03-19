import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10000];
        int c = 0;
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            boolean minus = a < 0;
            int n = minus ? -a : a;
            String binarResult = toBinar(n, 32);
            System.out.println(a);
            System.out.println(binarResult);
        }

    }
}
