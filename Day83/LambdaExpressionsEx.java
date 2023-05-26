//Lambda expressions in arrayList 
import java.util.ArrayList;
class LambdaExpressionsEx{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(9);
        arr.add(5);
        arr.add(34);
        arr.forEach(n->System.out.println(n));
        arr.forEach(n->{if(n%2==0)
            {
                System.out.println(n);
            }
        });
    }
}