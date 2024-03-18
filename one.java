import java.util.Arrays;

public class one {
    public static void main(String[] args) {
    
        int[] b = {1, 2, 4, 6, 5};

       
        mergeSort(b, 0, b.length - 1);

       

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }
}

    