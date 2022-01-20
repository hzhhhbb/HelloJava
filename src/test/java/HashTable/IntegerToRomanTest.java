package HashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void intToRoman() {
        int foo=1994;
        String expectValue="MCMXCIV";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }

    @Test
    void intToRoman1() {
        int foo=3;
        String expectValue="III";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }
    @Test
    void intToRoman2() {
        int foo=4;
        String expectValue="IV";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }
    @Test
    void intToRoman3() {
        int foo=9;
        String expectValue="IX";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }

    @Test
    void intToRoman4() {
        int foo=58;
        String expectValue="LVIII";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }
    @Test
    void intToRoman5() {
        int foo=20;
        String expectValue="XX";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }

    @Test
    void intToRoman6() {
        int foo=200;
        String expectValue="CC";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }

    @Test
    void intToRoman7() {
        int foo=60;
        String expectValue="LX";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }


    @Test
    void intToRoman8() {
        int foo=700;
        String expectValue="DCC";
        String actualValue=IntegerToRoman.intToRoman(foo);
        assert expectValue.equals(actualValue);
    }
}