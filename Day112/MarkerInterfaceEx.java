/*A marker interface is an interface that does not declare any methods. 
    It serves as a special type of interface that simply marks or tags a class as having a 
    certain characteristic or capability. The presence of the marker interface indicates that
    the class implementing it possesses specific behavior or features.
        java.io.Serializable
        java.lang.Cloneable
        java.util.EventListener
*/
import java.io.Serializable;
class Student implements Serializable{

}
class MarkerInterfaceEx{
    public static void main(String[] args){
        Student s1=new Student();
        if(s1 instanceof Serializable){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
