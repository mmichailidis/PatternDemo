package gr.mmichailidis.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonDemoTest {

    @Test
    public void printAndCount() {
        SingletonDemo s = SingletonDemo.getInstance();
        int i = s.printAndCount();
        assertEquals("The number was not 1 as expected", 1, i);
        i = s.printAndCount();
        assertEquals("The number was not 2 as expected", 2, i);

        SingletonDemo s2 = SingletonDemo.getInstance();
        i = s2.printAndCount();
        assertEquals("The number was not 3 as expected", 3, i);
    }
}