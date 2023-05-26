/*    The body of a lambda expression can contain zero, one, or more statements.
    When there is a single statement curly brackets are not mandatory and the return
     type of the anonymous function is the same as that of the body expression.
    When there is more than one statement, then these must be enclosed in curly brackets 
    (a code block) and the return type of the anonymous function is the same as the type 
    of the value returned within the code block, or void if nothing is returned.
*/
class LambdaExpressionsEx1{
    interface Inter1{
        int func(int a,int b);
    }
    interface Inter2{
        void msg(String mes);
    }
    int operate(int a,int b,Inter1 obj){
        return obj.func(a,b);
    }
    public static void main(String[] args){
        Inter1 add=(int x,int y)->x+y;
        Inter1 mul=(int a,int b)->a*b;
        LambdaExpressionsEx1 ex1=new LambdaExpressionsEx1();
        System.out.println(ex1.operate(2,3, mul));
        System.out.println(ex1.operate(4, 7, add));
        Inter2 msg=mes-> System.out.println("Hello "+mes);
        msg.msg("Keerthi");

        

    }
}