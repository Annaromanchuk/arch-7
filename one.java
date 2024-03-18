import java.util.Arrays;

public class one {
    public static void main(String[] args) {
    
        int[] b = {1, 2, 4, 6, 5};

       
        mergeSort(b, 0, b.length - 1);
        System.out.println(Arrays.toString(b));

        int median = Median(b);
        System.out.println("Медіана: ");
        System.out.println(median);

        int average = Average(b);
        System.out.println("Середнє значення: ");
        System.out.println(average);
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
        int i = 0, j = 0;
        int k = left;
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

    