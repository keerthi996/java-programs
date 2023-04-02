//To find out number of pairs of brackets are there
class Bracket{
    public static void main(String args[]){
        String s="()())[][";
        int ropen=0;
        int rclose=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ropen++;
            }
            else if(s.charAt(i)==')'){
                rclose++;
            }
        }
        int rExtras=0;
        if(ropen>=rclose){
            rExtras=ropen-rclose;
        }
        else{
            rExtras=rclose-ropen;
        }
        int rTotalPairs=((ropen+rclose)-rExtras)/2;
        System.out.println("Total round backet pairs are: "+rTotalPairs);
        System.out.println("Extra round brackets are: "+rExtras);
        int sopen=0;
        int sclose=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                sopen++;
            }
            else if(s.charAt(i)==']'){
                sclose++;
            }
        }
        int sExtras=0;
        if(sopen>=sclose){
            sExtras=sopen-sclose;
        }
        else{
            sExtras=sclose-sopen;
        }
        int sTotalPairs=((sopen+sclose)-sExtras)/2;
        System.out.println("Total square bracket pairs are: "+sTotalPairs);
        System.out.println("Extra square brackets are: "+sExtras);
        
    }
}