//compareTo method returns the difference of length of strings which is not similar
class CompareTo{
    public static void main(String[] args){
        String s="java programming";
        String s1="java";
        System.out.println(s.compareTo(s1));
        System.out.println(s1.compareTo(s));
        String s2="java";
        String s3="lava";
        System.out.println(s2.compareTo(s3)); 
        //s2 is not substring of s3, so it compares the ASCII code difference i.e., j=106,l=108; 106-108=-2
    }
}