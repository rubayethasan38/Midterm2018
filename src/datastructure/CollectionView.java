package datastructure;

import java.util.Collection;
import java.util.HashMap;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "LA");
                map.put(3, "Denver");
                map.put(4, "Boston");
                map.put(5, "San Jose");
                map.put(5, "Seattle");
                Map checkMap = Collections.checkedMap(map,Integer.class,String.class);
                System.out.println("Checked map content: "+checkMap);
                Iterator<Integer> it = checkMap.keySet().iterator();
                while(it.hasNext()){
                        Integer key = it.next();
                        String value = (String) checkMap.get(key);
                        System.out.println(key+" "+value);
                }

        }

}
