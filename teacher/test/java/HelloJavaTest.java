import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Teacher tests to verify {@link HelloJava} class behavior
 */
public class HelloJavaTest {

    // public static final double DELTA = 0.0000001;

    @Test(timeout = 1000)
    public void sayHelloTest() {
        String str = HelloJava.sayHello();
        assertThat(str, is("Hello Java"));
    }

    @Test(timeout = 1000)
    public void sortIntegersTest() {
        List<Integer> initialList = new ArrayList<Integer>(Arrays.asList(678,
                4, 3, 7, 3, 88, 9));
        List<Integer> sortedList = HelloJava.sortIntegers(initialList);
        assertThat(sortedList, is(Arrays.asList(3, 3, 4, 7, 9, 88, 678)));
    }

    @Test(timeout = 1000)
    public void sumListTest() {
        List<Integer> initialList = new ArrayList<Integer>(Arrays.asList(678,
                4, 3, 7, 3, 88, 9));
        Integer result = HelloJava.sumList(initialList);
        assertThat(result, is(792));
    }

    @Test(timeout = 1000)
    public void calculateTest() {
        List<Integer> initialList = new ArrayList<Integer>(Arrays.asList(678,
                4, 3, 7, 3, 88, 9));
        Integer result = HelloJava.sumListConditionally(initialList);
        assertThat(result, is(1356));
    }
/*
    @Test(timeout = 1000)
    public void reverseCaseTest() {
        assertThat(HelloJava.reverseCase("Hello world!"),
                is("hELLO WORLD!"));
    }

    @Test(timeout = 1000)
    public void defineFunctionalInterfaceTest() {
        assertEquals("HelloJava.defineFunctionalInterface() failed", 42.0,
                HelloJava.defineFunctionalInterface(42.0), DELTA);
    }

    @Test(timeout = 1000)
    public void functionCompositionTest() {
        assertEquals("HelloJava.functionComposition() failed", Math.sqrt(0.5),
                HelloJava.functionComposition(45.0), DELTA);
    }

    @Test(timeout = 1000)
    public void functionCombinationTest() {
        assertThat(HelloJava.functionCombination(), is(-1));
    }*/
}

