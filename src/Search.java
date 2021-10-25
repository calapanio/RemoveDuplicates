import java.util.ArrayList;
import java.util.Objects;

public class Search{
    public static <E>ArrayList<E> removeDuplicates(ArrayList<E> list){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = 0; j < list.size()-1; j++){
                if(Objects.equals(list.get(i).toString(), list.get(j).toString()) && j != i)list.remove(j);
            }
        }
        return list;
    }
}
