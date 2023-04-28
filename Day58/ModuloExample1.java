public class ModuloExample1 {
    public static void main(String[] args) {
        
        long num=2349709890123439l;

        long num1=34845678398l;

        long m=10000567007l;

        long sum = (num%m) + (num1%m);
        

        System.out.println(sum);

        long sub = (num%m) - (num1%m);

        System.out.println(sub);

        long mul = (num%m) * (num1%m);

        System.out.println(mul);

        long div = (num%m)/(num1%m); 
    
        System.out.println(div);
    }

}