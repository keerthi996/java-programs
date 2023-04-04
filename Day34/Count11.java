//to count number of 11's present in given string

class Count11{
    public static void main(String[] args){
        String str="11dsd11ef111his111";
        System.out.println(count(str));
    }
static int count(String str) {
  if(str.length()<2)
  return 0;
  if(str.substring(0,2).equals("11"))
  return 1+count(str.substring(2));
  return count(str.substring(1));
}
}