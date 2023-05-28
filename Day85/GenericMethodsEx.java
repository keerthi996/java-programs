class GenericMethodsEx{
    public static void main(String[] args){
        Integer sum1=add(2,3);
        System.out.println(sum1);
        String sum2=add("Keerthi","Kudumula");
        System.out.println(sum2);
        Float sum3=add(12.3f,56.2f);
        System.out.println(sum3);
        Double sum4=add(234.6,890.34);
        System.out.println(sum4);


    }
    public static <T>T add(T obj,T obj1){
        if(obj instanceof Integer && obj1 instanceof Integer){
            Integer result=(Integer)obj+(Integer)obj1;
            return (T)result; 
        }
        else if(obj instanceof Double && obj1  instanceof Double){
            Double result=(Double)obj+(Double)obj1;
            return (T)result;
        }
        else if(obj instanceof String && obj1  instanceof String){
            String result=(String)obj+(String)obj1;
            return (T)result;
        }
        else if(obj instanceof Float && obj1  instanceof Float){
            Float result=(Float)obj+(Float)obj1;
            return (T)result;
        }
        else{
            throw new IllegalArgumentException("elements must be of number type");
        }
        
    }
}