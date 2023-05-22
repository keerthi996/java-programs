class StringBuilderEx1 {
    public static void main(String[] args)
    {
 
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder
            str
            = new StringBuilder("hii hello goodmorning");
 
        // print string
        System.out.println("Before removal String = "
                           + str.toString());
 
        // remove the substring from index 1 to 8
        StringBuilder afterRemoval = str.delete(1, 8);
 
        // start equal to end so no change in string
        // print string after removal of substring
        System.out.println("After removal of SubString: "+ afterRemoval.toString());
 
        afterRemoval = str.deleteCharAt(8);
        System.out.println(afterRemoval.toString());
    }
}