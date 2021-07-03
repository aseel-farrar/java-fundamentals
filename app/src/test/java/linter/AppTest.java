package linter;

import org.junit.jupiter.api.Test;
import java.util.*;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App tester = new App();

    @Test
    public void testLintMethod() {
//        ArrayList<Integer> expected= new ArrayList<>();
        //file with errors
        ArrayList<Integer> output = tester.readFile("C:\\Users\\aseel\\Desktop\\asac\\401\\java-fundamentals\\app\\src\\main\\java\\linter\\jsFileError.js");
        ArrayList<Integer> expected = new ArrayList<>() {
            {
                add(2);
                add(5);
                add(6);
                add(24);
            }
        };
//         expected = {add(2), add(5), add(6), add(24)};

        assertEquals("must be " + expected, output);

        //file with no errors
        output = tester.readFile("C:\\Users\\aseel\\Desktop\\asac\\401\\java-fundamentals\\app\\src\\main\\java\\linter\\jsFile.js");
//        expected = null;
        assertEquals("must be no output", null, (Supplier<String>) output);

        // an empty file
        output = tester.readFile("C:\\Users\\aseel\\Desktop\\asac\\401\\java-fundamentals\\app\\src\\main\\java\\linter\\jsFileEmpty.js");
//        expected = null;
        assertEquals("must be no output", null, (Supplier<String>) output);
    }
}