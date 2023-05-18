import java.util.HashMap;
class HashMapEx1{
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Keerthi");
        map.put(3,"Yashu");
        map.put(4,"Aishu");
        map.put(5,"Anusha");
        map.put(2, "Harika");
        for(HashMap.Entry<Integer,String> x:map.entrySet()){
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
        map.put(1, "Thanusha");
        System.out.println(map);
    }
}