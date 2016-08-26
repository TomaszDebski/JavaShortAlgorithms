/**
 * Created by tomek on 26.08.16.
 */
public class IfArrayContainsDuplicates {

    public static void main(String[] args){
        //Given an array of integers, find if the array contains any duplicates.
        //Your function should return true if any value appears at least twice
        //in the array, and it should return false if every element is distinct.
        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(ifContainsDuplicate(array1));
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9,1};
        System.out.println(ifContainsDuplicate(array2));
        int[] array3 = new int[]{1,2,3,4,5,6,7,8,9,8,8,8,8,8,8};
        System.out.println(ifContainsDuplicate(array3));
    }

    private static boolean ifContainsDuplicate(int[] array){
        boolean isDuplicated = false;
        for(int i = 0 ; i<array.length;i++){
            for(int j = i+1 ; j<array.length;j++){
                if (array[i] == array[j]){
                    isDuplicated = true;
                    break;
                }
            }
            if(isDuplicated){
                break;
            }
        }
        return isDuplicated;
    }
}
