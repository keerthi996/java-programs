public class Sum {
    public static void main(String[] args) {

        int sum = 20;

        for(var x : args) {

            sum += Integer.parseInt(x);

        }
        
        System.out.println(sum);
    }
    
}