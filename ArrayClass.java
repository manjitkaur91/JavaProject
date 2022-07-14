import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        // work on array , not on array list
/* Binary search work on sorted array, if the array is not sorted then sort first with array.sort
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int index= Arrays.binarySearch(num,4);

        System.out.println("print index of element::"+ index);
    */
        Integer[] num={45,3,4,6,2,9,23};
        Arrays.sort(num);
        System.out.println(num);

    }
}
