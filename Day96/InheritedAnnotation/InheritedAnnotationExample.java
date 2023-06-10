class InheritedAnnotationExample extends Students{
    public static void main(String[] args){
        InheritedAnnotationExample in=new InheritedAnnotationExample();
        System.out.println(in.getClass().getAnnotation(Study.class));
    }
}