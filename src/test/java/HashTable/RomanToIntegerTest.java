package HashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        String s="MCMXCIV";
        int expectResult=1994;
        int actualResult=RomanToInteger.romanToInt(s);
        assert expectResult==actualResult;
    }

    @Test
    void romanToInt1() {
        String s="CMXCIX";
        int expectResult=999;
        int actualResult=RomanToInteger.romanToInt(s);
        assert expectResult==actualResult;
    }
}