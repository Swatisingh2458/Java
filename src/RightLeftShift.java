public class RightLeftShift {
    public static void main(String[] args) {

        int [] Arr = {1,2,3,4,5,6};
        clockwise(Arr);
        Array(Arr);
        Anticlockwise(Arr);
        Array(Arr);
    }
    public static void clockwise(int[] Arr) {
        int temp = Arr[Arr.length - 1];
        for (int i = Arr.length - 1; i > 0; i--) {
            Arr[i] = Arr[i - 1];
        }
        Arr[0] = temp;
    }
    public static void Anticlockwise(int[] Arr) {
        int temp = Arr[0];
        for (int i =0; i < Arr.length - 1; i++) {
            Arr[i] = Arr[i + 1];
        }
        Arr[Arr.length - 1] = temp;
    }


    public static void Array(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

