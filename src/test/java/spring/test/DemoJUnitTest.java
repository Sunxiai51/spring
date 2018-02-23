package spring.test;

import org.junit.Assert;
import org.junit.Test;

public class DemoJUnitTest {

    @Test
    public void demoTest() {
        int a = (int) Math.random() * 10;
        boolean b = a < 8;
        Assert.assertTrue(b);
    }

}
