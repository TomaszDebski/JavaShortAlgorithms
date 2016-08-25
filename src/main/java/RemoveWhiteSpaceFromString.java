/**
 * Created by tomek on 25.08.16.
 */
public class RemoveWhiteSpaceFromString {

    //Write a java program to remove
    //all white spaces from a string

    public static void main(String[] args) {

        String name = "abc de   fg";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<name.length();i++){
            if(name.charAt(i) != ' '){
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
