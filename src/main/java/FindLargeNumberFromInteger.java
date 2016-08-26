import java.util.Arrays;

/**
 * Created by tomek on 26.08.16.
 */
public class FindLargeNumberFromInteger {

    public static void main(String[] args){
        //Given a list of non negative integers, arrange them such that they form the largest number.
        //For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
        //(Note: The result may be very large, so you need to return a string instead of an integer.)

        String[] array = new String[]{"1","5","0099","56","12"};
        Arrays.sort(array,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        Arrays.stream(array).forEach(a -> sb.append(a));
        System.out.println(sb);

    }
}
