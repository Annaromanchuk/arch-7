public class App {

    public static void main(String[] args) {

        int a = 224;
        boolean minus = a < 0;
        int n = minus ? -a : a;
        String binarResult = toBinar(n, 32);

        System.out.println(a);
        System.out.println(binarResult);
    }

    public static String toBinar(int n, int b) {
        String binar = "";

        for (int i = b - 1; i >= 0; i--) {
            int bit = (n >> i) & 1;
            binar += bit;
        }
        return binar.toString();
    }
}