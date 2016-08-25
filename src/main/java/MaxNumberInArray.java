/**
 * Created by tomek on 25.08.16.
 */
public class MaxNumberInArray {

    //write program which find any position max number in array
    public static void main(String a[]){
        int[] array = new int[]{1,2,9,2,3,9,4,5,6,7,11,8,9};
        int maxNumber = array[0];
        int position = 0;
        for(int i = 1 ; i<array.length;i++){
            if(array[i] > maxNumber){
                maxNumber = array[i];
                position = i;
            }
        }
        System.out.println("First occurence of dominate number "+ maxNumber +" is: " + position);
    }
}
