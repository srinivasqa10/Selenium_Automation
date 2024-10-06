package TestNGFiles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test()
    {
        Assert.assertEquals("xyz", "xyz1");

        Assert.assertNotEquals(123, 123);

        Assert.assertTrue(1==1);

        Assert.assertFalse(1==2);

        Assert.fail();
    }
}
