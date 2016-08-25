
import java.util.Map;
import java.util.HashMap;
/**
 * Created by tomek on 25.08.16.
 */
public class FindOutDuplicateCharsInSpring {
    //    Write a program to find out duplicate characters in a string

    public static void main(String a[]){
        String name = "abcdecdccb";
        Map<Character,Integer> mapa = new HashMap<>();
        for(int i = 0 ; i<name.length();i++){
            char character = name.charAt(i);
            int sum = 0;
            for(int j=i ; j<name.length();j++){
                if (mapa.containsKey(character)){
                    break;
                }
                if(character == name.charAt(j)){
                    sum += 1;
                }
            }
            if(sum > 1){
                mapa.put(character, sum);
            }
        }
        mapa.forEach((k,v) -> System.out.println("key " + k + " value " + v));
    }
}
