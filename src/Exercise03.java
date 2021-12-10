import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03 {
    public static void main(String[] args) {
        String [][] preMap = {{"KEY 1", "VALUE 1"},
                              {"KEY 2", "VALUE 2"},
                              {"KEY 3", "VALUE 3"}};

        System.out.println(mappingArray(preMap));

    }

    public static <T> Map<T, T> mappingArray(T [][] items){
        /*
        This method transform a multidimensional array in a map,
        but the map key and value will be the same variable type
         */
        Map <T,T> map = new LinkedHashMap<>();

        for (T[] item : items) {
            map.put(item[0], item[1]);
        }

        return map;
    }
}

