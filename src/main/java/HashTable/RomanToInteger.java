package HashTable;

import java.util.HashMap;
import java.util.Map;

//13. 罗马数字转整数
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<String, Integer> romanAndIntKv = new HashMap<>();
        romanAndIntKv.put("I", 1);
        romanAndIntKv.put("V", 5);
        romanAndIntKv.put("X", 10);
        romanAndIntKv.put("L", 50);
        romanAndIntKv.put("C", 100);
        romanAndIntKv.put("D", 500);
        romanAndIntKv.put("M", 1000);
        romanAndIntKv.put("IV", 4);
        romanAndIntKv.put("IX", 9);
        romanAndIntKv.put("XL", 40);
        romanAndIntKv.put("XC", 90);
        romanAndIntKv.put("CD", 400);
        romanAndIntKv.put("CM", 900);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            String tempStr = Character.toString(tempChar);
            if (i + 1 < s.length()) {
                char tempChar1 = s.charAt(i + 1);
                String tempStr1 = Character.toString(tempChar1);
                if (romanAndIntKv.containsKey(tempStr + tempStr1)) {
                    sum += romanAndIntKv.get(tempStr + tempStr1);
                    i++;
                    continue;
                }

            }
            sum += romanAndIntKv.get(tempStr);

        }
        return sum;
    }
}
