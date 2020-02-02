
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * Created by tomek on 25.08.16.
 */
public class DominateNumberInArray {

    //write program which find any position dominate number in array
    public static void main(String a[]){
//        int[] array = new int[]{1,2,9,2,3,1,9,4,5,1,6,7,1,11,8,9};
//        Map<Integer,Integer> mapa = new HashMap<>();
//        int number = array[0];
//        int count = 1;
//        int position =0;
//        mapa.put(number, 1);
//        for(int i = 1 ; i<array.length;i++){
//            if(!mapa.containsKey(array[i])) {
//                mapa.put(array[i], 1);
//            }else{
//                mapa.replace(array[i],mapa.get(array[i])+1);
//
//                if(count <mapa.get(array[i])){
//                    number = array[i];
//                    count = mapa.get(array[i]);
//                    position = i;
//                }
//            }
//        }
//        mapa.forEach((k,v) -> System.out.println("key " + k + " value " + v));
//        System.out.println("Number " + number + " and position " + position);

        System.out.println("-----------------------------------");
        int data[] = { 1, 5, 7, 4, 6, 2, 0, 1, 3, 2, 2 };
        Map<Integer, Long> count = Arrays.stream(data)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), counting()));

        count.forEach((k,v)->System.out.println("key " + k + " , value = " + v));
        System.out.println(count.entrySet());
        int max = count.entrySet().stream()
                .max((first, second) -> {
                    return (int) (first.getValue() - second.getValue());
                })
                .get().getKey();

        System.out.println(max);
    }
}
