//{5,9,3,2,6,7,4} min =2 maximimum element after 2 is 7 .difference b/w 2 and 7 is 5
class MaxMin{
    public static void main(String args[]){
        int a[]={9,5,3,2,6,7,4};
        int min=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[min]){
                min=i;
            }
        }
        int max=min;
        for(int i=min+2;i<a.length;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        System.out.println(a[max]-a[min]);
    }

}