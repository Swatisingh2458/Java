import java.util.Arrays;

public class ValueInsertion {
    public static void main(String[] args) {
        int [] Arr = new int[7];
        Arr[0]=1;
        Arr[1]=2;
        Arr[2]=3;
        Arr[3]=4;
        Arr[4]=5;
        Arr[5]=6;
        insertion(Arr,2,400);



    }


    public static void insertion(int[] arr, int index, int value){
        for (int i = arr.length-2; i >=index ; i--) {
            arr[i+1]=arr[i];
            arr[index]=value;
        }
        System.out.println(Arrays.toString(arr));

    }
}
