package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertStringToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
    }
    @Test
    public void should_pass_when_input_empty_string() {
        String input = "";
        System.out.println("input: "+input);
        assertEquals("", ConvertStringToCamelCase.toCamelCase(input));
    }


}