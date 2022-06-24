import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,9,11,2,7,3,8};
        int[] arr2 = {1,3,2,4,5,10,11,6};
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];
        int pos = 0;
        for(int element : arr1){
            arr3[pos] = element;
            pos++;
        }
        for(int element : arr2){
            arr3[pos] = element;
            pos++;
        }
        Arrays.sort(arr3);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr3.length;i++){
            set.add(arr3[i]);
        }
        System.out.println(set);


    }

}