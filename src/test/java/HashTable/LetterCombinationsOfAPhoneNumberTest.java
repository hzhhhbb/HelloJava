package HashTable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LetterCombinationsOfAPhoneNumberTest {

    @Test
    void letterCombinations() {
        String str = "";
        List<String> actualValue = LetterCombinationsOfAPhoneNumber.letterCombinations(str);
        assert 0 == actualValue.size();
    }

    @Test
    void letterCombinations1() {
        String str = "23";
        List<String> expectedValue = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> actualValue = LetterCombinationsOfAPhoneNumber.letterCombinations(str);
        assert expectedValue.size() == actualValue.size();
    }

    @Test
    void letterCombinations2() {
        String str = "2";
        List<String> expectedValue = Arrays.asList("a","b","c");
        List<String> actualValue = LetterCombinationsOfAPhoneNumber.letterCombinations(str);
        assert expectedValue.size() == actualValue.size() && expectedValue.equals(actualValue);
    }

    @Test
    void letterCombinations3() {
        String str = "22";
        List<String> expectedValue = Arrays.asList("aa","ab","ac","ba","bb","bc","ca","cb","cc");
        List<String> actualValue = LetterCombinationsOfAPhoneNumber.letterCombinations(str);
        assert expectedValue.size() == actualValue.size() && expectedValue.equals(actualValue);
    }

    @Test
    void letterCombinations4() {
        String str = "222";
        List<String> expectedValue = Arrays.asList("aaa","aab","aac","aba","abb","abc","aca","acb","acc","baa","bab","bac","bba","bbb","bbc","bca","bcb","bcc","caa","cab","cac","cba","cbb","cbc","cca","ccb","ccc");
        List<String> actualValue = LetterCombinationsOfAPhoneNumber.letterCombinations(str);
        assert expectedValue.size() == actualValue.size() && expectedValue.equals(actualValue);
    }
}