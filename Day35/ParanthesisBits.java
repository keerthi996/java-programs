class ParanthesisBits{
  static String parenBit(String str) {
    int l=str.length();
    if(str.charAt(0)=='('){
      if(str.charAt(l-1)==')'){
        return str;
      }
      else{
        return parenBit(str.substring(0,l-1));
      }
    }
    else{
      return parenBit(str.substring(1));
    }
  }
  public static void main(String args[]){
    String str="((hello))";
    System.out.println(parenBit(str));
  }
}
