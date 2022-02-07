package String;

public class SpinWords {
    public String spinWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        String[] strs = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str :
                strs) {
            if (str.length() >= 5) {
                sb.append(new StringBuffer(str).reverse()).append(" ");
            } else {
                sb.append(str);
            }
        }
        return sb.toString().trim();
    }
}
