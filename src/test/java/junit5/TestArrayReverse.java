package junit5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestArrayReverse {



    @Test
    public void testReverseSelf() throws Exception {
        System.out.println("use ReverseSelf");

        String[] strings = { "ramer", "jelly", "bean", "cake" };
        System.out.println("\t" + Arrays.toString(strings));
        for (int start = 0, end = strings.length - 1; start < end; start++, end--) {
            String temp = strings[end];
            strings[end] = strings[start];
            strings[start] = temp;
        }

        System.out.println("\t" + Arrays.toString(strings));
    }


}
