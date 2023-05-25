/* Lambda expressions are similar to methods, but they do not need a name and 
        they can be implemented right in the body of a method.
        Syntax-----(parameter1, parameter2) -> { code block }
*/
class LambdaExpressionEx{
    public static void main(String[] args){
        Hello h1=()->{
            System.out.println("Hi...GoodMorning");
        };
        h1.wish();
    }
}
interface Hello{
    void wish();
}