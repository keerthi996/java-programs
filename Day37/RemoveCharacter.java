class RemoveCharacter{
    public static void main(String[] args){
        String str="llljjjkkkmmm";
         for(int i=0;i<str.length();i++){
              if(i==str.length()-1){
                if(str.charAt(i)==str.charAt(i-1))
                System.out.print(str.charAt(i));
            }
           else if(str.charAt(i)!=str.charAt(i+1))
            System.out.print(str.charAt(i));
          
        }
    }
}
