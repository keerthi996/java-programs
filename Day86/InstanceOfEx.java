public class InstanceOfEx {
    public static void main(String[] args){
        Girls g=new Girls("Keerthi");
        if(g instanceof Girls){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
class Girls{
    String name;
    Girls(String name){
        this.name=name;
    }
}
