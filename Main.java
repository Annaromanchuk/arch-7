import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        
        int a = 224;
            boolean minus = a < 0;
            int n = minus ? -a : a;
            String binarResult = toBinar(n, 32);
            System.out.println(a);
            System.out.println(binarResult);
        
        int[] b = {0, 4, 2, 5, 9};
        mergeSort(b, 0, b.length - 1);
        
        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(b));

        int median = Median(b);
        System.out.println("Медіана:");
        System.out.println(median);

        double average = Average(b);
        System.out.println("Середнє значення:");
        System.out.println(average);
    
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
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }
    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static int Median(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2;
        } else {
            return arr[n / 2];
        }
    }

    public static int Average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    }
