/*
NumberFormat is an abstract base class for all number formats. This class provides the 
interface for formatting and parsing numbers. NumberFormat also provides methods for
determining which locales (US, India, Italy, etc.) have number formats and their names. 
NumberFormat helps you to format and parse numbers for any locale. 
*/

import java.text.NumberFormat;
import java.util.Locale;

class NumberFormatEx{
    public static void main(String[] args){
        NumberFormat nf = NumberFormat.getNumberInstance();//creating intance of number format
        Locale l=new Locale("En", "In");//creating locale 
        NumberFormat inNf=NumberFormat.getInstance(l);

        int num=1000000;
        String formattedNum=inNf.format(num);
        System.out.println(formattedNum);
        System.out.println(nf.getCurrency());//By default it shows Us dollars

        NumberFormat currencyFormat=inNf.getCurrencyInstance(l);
        String formattedCurrency = currencyFormat.format(num);

        System.out.println(formattedCurrency);

        NumberFormat percentageFormat=inNf.getPercentInstance(l);
        String formattedPercent=percentageFormat.format(num);

        System.out.println(formattedPercent);


        

    }
}

