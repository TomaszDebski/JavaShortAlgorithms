
import java.util.Map;
import java.util.HashMap;
/**
 * Created by tomek on 25.08.16.
 */
public class DominateNumberInArray {

    //write program which find any position dominate number in array
    public static void main(String a[]){
        int[] array = new int[]{1,2,9,2,3,1,9,4,5,1,6,7,1,11,8,9};
        Map<Integer,Integer> mapa = new HashMap<>();
        int number = array[0];
        int count = 1;
        int position =0;
        mapa.put(number, 1);
        for(int i = 1 ; i<array.length;i++){
            if(!mapa.containsKey(array[i])) {
                mapa.put(array[i], 1);
            }else{
                mapa.replace(array[i],mapa.get(array[i])+1);

                if(count <mapa.get(array[i])){
                    number = array[i];
                    count = mapa.get(array[i]);
                    position = i;
                }
            }
        }
        mapa.forEach((k,v) -> System.out.println("key " + k + " value " + v));
        System.out.println("Number " + number + " and position " + position);
    }
}
