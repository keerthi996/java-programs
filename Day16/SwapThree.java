class SwapThree{
    public static void main(String args[]){
        int a=4;
        int b=6;
        int c=7;
        a=a+b+c;
        b=b+c;
        c=b-c;
        b=a-b;
        a=a-(b+c);
        System.out.println("a="+a+" b="+b+" c="+c);
    }
}