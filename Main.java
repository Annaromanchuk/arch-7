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
    }
}
