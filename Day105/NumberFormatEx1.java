import java.text.NumberFormat;

public class NumberFormatEx1 {
    public static void main(String[] args){
        double num=1234.5678;
        NumberFormat nf=NumberFormat.getInstance();
        String formattedNum=nf.format(num);
        System.out.println(formattedNum);
        nf.setMaximumFractionDigits(2);
        String formattedWithMaxDigits=nf.format(num);
        System.out.println(formattedWithMaxDigits);


       
    }
}
