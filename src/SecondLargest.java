public class SecondLargest {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int[] Arr = {0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > secMax && Arr[i] < max ) {
                secMax = Arr[i];
            }
        }
        System.out.println(secMax);
    }
}