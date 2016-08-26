import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomek on 26.08.16.
 */
public class ReverseStringOneByOne {

    public static void main(String[] args){
        //Given an input string, reverse the string word by word.
        //A word is defined as a sequence of non-space characters.

        String myString = "My name is Tom";
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<myString.length();i++){
            sb.append(myString.trim().charAt(i));
            if (myString.charAt(i) == ' '){
                sb.deleteCharAt(sb.length()-1);
                list.add(sb.toString());
                sb.delete(0, sb.length());
            }else if(i == myString.length()-1){
                list.add(sb.toString());
            }
        }
        // Alternative proposal
        //        Collections.reverse(list);
        //----------------------------

        // Other way
        List<String> reverseList = new ArrayList<>();
        for (String string : list) {
            reverseList.add(0,string);
        }
        reverseList.forEach(x -> System.out.print(x + " "));
    }
}
