//Create a new string where the same characters are saperated by *
class Star{
    public static void main(String[] args){
        String str="keerthi";
        System.out.println(pair(str));
    }

static String pair(String str) {
  if(str.length()<2)
  return str;
  if(str.charAt(0)==str.charAt(1))
  return str.charAt(0)+"*"+pair(str.substring(1));
  return str.charAt(0)+pair(str.substring(1));
}
}