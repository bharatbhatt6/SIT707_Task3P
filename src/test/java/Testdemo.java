import org.junit.Assert;
import org.junit.Test;

public class Testdemo {

    @Test
    public void testConcatValidStrings() {
        Demo demo = new Demo();
        String result = demo.concat("Deakin", "University");
        Assert.assertEquals("DeakinUniversity", result);
    }

    @Test
    public void testConcatEmptyStrings() {
        Demo demo = new Demo();
        String result = demo.concat("", "");
        Assert.assertEquals("", result);
    }

    @Test
    public void testAddValidIntegersAboveZero() {
        Demo demo = new Demo();
        int result = demo.add(2, 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testAddValidIntegersZeroNonzero() {
        Demo demo = new Demo();
        int result = demo.add(0, 2);
        Assert.assertEquals(2, result);
    }
}
