class CountingCharacters{
    public static void main(String[] args){
        String str="xxxtttlllpp";
        String res="";
        for(int i=0;i<str.length();){
            int count=0;
            int j;
            for(j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                count++;
                else
                break;
            }
            if(count==0)
            res+=str.charAt(i);
            else
            res+=str.charAt(i)+Integer.toString(count);
            i=j;
           
        }
         System.out.println(res);
    }
}