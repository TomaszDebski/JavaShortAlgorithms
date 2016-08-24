import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomek on 24.08.16.
 */
public class CountAbsoluteValue {

    public static void main(String [] a){
        int[] tablica = new int[]{-3, -2, -1, 0, 1, 3, 5};
        int counter = 1;
        int[] secondTab = new int[tablica.length];
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(Math.abs(tablica[0]));
        for(int i=1;i<tablica.length;i++){
            if(!lista.contains(Math.abs(tablica[i]))){
                lista.add(Math.abs(tablica[i]));
                counter++;
            }
        }
        System.out.println(counter);
    }
}
