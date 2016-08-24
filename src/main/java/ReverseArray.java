/**
 * Created by tomek on 24.08.16.
 */
public class ReverseArray {

    //Reverse array

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 7, 8, 9};
        int temporary;
        for (int i = 0; i < (array.length) / 2; i++) {
            temporary = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temporary;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
