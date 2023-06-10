@Example(name="Keerthi")
public class DocumentedAnnotationExample{
    public static void main(String[] args){
        DocumentedAnnotationExample de=new DocumentedAnnotationExample();
        System.out.println(de.getClass().getAnnotation(Example.class));
    }
}