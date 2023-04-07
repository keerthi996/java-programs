//program to print middle elements of every word in the sentence
class Middle{
    public static void main(String args[]){
        String s="Iam Keerthi";
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++){
            if(a[i].length()%2==0){
                System.out.print(a[i].charAt(a[i].length()/2-1)+a[i].charAt(a[i].length()/2));
            }
            else{
                System.out.print(a[i].charAt(a[i].length()/2));
            }
            System.out.print(" ");
        }
    }
}