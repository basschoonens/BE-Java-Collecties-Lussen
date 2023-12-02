import java.util.HashMap;

public class Translator {

    HashMap<Integer,String> numericAlpha = new HashMap<Integer,String >();

    public String translate(Integer number){
        return numericAlpha.get(number);
    }

    public Translator(String[] alphabetic, Integer[] numeric){

        for (int i = 1; i <= alphabetic.length; i++) {
            numericAlpha.put(numeric[i - 1],alphabetic[i - 1]);


        }
    }





}
