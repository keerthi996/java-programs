class SwapFour{
    public static void main(String args[]){
        int a=4;
        int b=6;
        int c=7;
        int d=9;
        a=a+b+c+d;
        b=a-(b+c+d);
        c=a-(b+c+d);
        d=a-(b+c+d);
        a=a-(b+c+d);
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
    }
}