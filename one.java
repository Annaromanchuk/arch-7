import java.util.Arrays;

public class one {
    public static void main(String[] args) {
    
        int[] b = {1, 2, 4, 6, 5};

       
        mergeSort(b, 0, b.length - 1);

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

    