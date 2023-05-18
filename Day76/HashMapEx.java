/*It allows to store the null keys as well, but there should be only one null key object 
    and there can be any number of null values. This class makes no guarantees as to the order
    of the map. To use this class and its methods, you need to import java.util.HashMap package
    or its superclass.

    Fast access time
    Stores key-value pairs
    Supports null keys and values:
    Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved. 
    However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
    Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys.
     If a duplicate key is added, the previous value associated with the key is overwritten.
*/
import java.util.HashMap;
class HashMapEx{
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Keerthi");
        map.put(3,"Yashu");
        map.put(4,"Aishu");
        map.put(5,"Anusha");
        map.put(2, "Harika");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        map.remove(1);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Yashu"));
        System.out.println(map.isEmpty());
        System.out.println(map.values());
        

    }
}