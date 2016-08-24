/**
 * Created by tomek on 24.08.16.
 */
public class PositionCenterNumber {

    //    You are given an array of numbers.
//    Find out the array index or position where sum of numbers preceeding the
//    index is equals to sum of numbers succeeding the index.

    public static void main(String a[]) {
        int[] array = new int[]{0, 1, 2, 3, 4, 0, 0, 0, 1, 4, 3, 2, 1, 0};
        for (int i = 1; i < array.length - 1; i++) {
            int sumPre = 0;
            int sumPost = 0;
            for (int pre = 0; pre < i; pre++) {
                sumPre += array[pre];
            }
            for (int post = i + 1; post < array.length; post++) {
                sumPost += array[post];
            }
            if (sumPre == sumPost) {
                System.out.println("Position " + i);
                break;
            }
        }
    }
}
