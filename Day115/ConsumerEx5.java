import java.util.*;
import java.util.function.*;
class ConsumerEx5{
    public static void main(String[] args){
        Consumer<List<Integer>> modifyList = l -> {
            List<Integer> modifiedList = new ArrayList<>();
            for (Integer element : l) {
                modifiedList.add(2 * element);
            }
            l.clear();
            l.addAll(modifiedList);
        };
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        modifyList.accept(list);
        Consumer<List<Integer>> dispList=l->l.stream().forEach(s->System.out.println(s+" "));
        dispList.accept(list);

    }
}