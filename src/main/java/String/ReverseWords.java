package String;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String original)
    {
        if(original.trim().isEmpty()){
            return original;
        }
        return Arrays.stream(original.split(" ")).map(u->new StringBuilder(u).reverse()).collect(Collectors.joining(" "));
    }
}
