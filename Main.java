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
        int[] b = {0, 4, 2, 5, 9};
        mergeSort(b, 0, b.length - 1);
//* треба ввести будь-який знак,
// щоб відобразилося наступна команда (сортування)
        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(b));

        int median = Median(b);
        System.out.println("Медіана:");
        System.out.println(median);

        double average = Average(b);
        System.out.println("Середнє значення:");
        System.out.println(average);
        scanner.close();
    }
    public static String toBinar(int n, int b) {
        String binar = "";
        for (int i = b - 1; i >= 0; i--) {
            int bit = (n >> i) & 1;
            binar += bit;
        }
        return binar.toString();
    }
    public static String addition(String binary) {
        String addition = "";
        boolean f = false;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (f) {
                addition = (bit == '0' ? '1' : '0') + addition;
            } else {
                addition = bit + addition;
                if (bit == '1') {
                    f = true;
                }
            }
        }
        return addition.toString();
    }

    }
