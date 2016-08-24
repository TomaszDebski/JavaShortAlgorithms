/**
 * Created by tomek on 24.08.16.
 */
public class FirstNonRepeatedChar {
    public static void main(String[] args){
        //Write code to find the First non repeated character in the String
        String name = "abcdeabc";
        boolean isReapeat = false;
        for(int i=0;i<name.length();i++){
            char character = name.charAt(i);
            isReapeat = false;
            for(int j=0;j<name.length();j++){
                if (character == name.charAt(j) && i != j){
                    isReapeat = true;
                    break;
                }
            }
            if(!isReapeat){
                System.out.print(character);
                break;
            }
        }
    }
}
