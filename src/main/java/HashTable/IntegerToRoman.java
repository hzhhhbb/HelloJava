package HashTable;

import java.util.*;

//12. 整数转罗马数字
public class IntegerToRoman {
    public static String intToRoman(int num) {

        SortedMap<Integer,String> map =new TreeMap<>(Comparator.reverseOrder());
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(600,"DC");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(8,"VIII");
        map.put(7,"VII");
        map.put(6,"VI");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(3,"III");
        map.put(2,"II");
        map.put(1,"I");
        StringBuilder sb=new StringBuilder();

        while (num!=0){
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if(entry.getKey()<=num){
                    sb.append(entry.getValue());
                    num-=entry.getKey();
                    break;
                }
            }
        }

        return sb.toString();
    }
}
