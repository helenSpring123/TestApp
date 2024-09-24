import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.PanelUI;

public class ReversedStringTest {

    @Test
    public void testReversedwithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
        System.out.println("This is a null passed");
    }

    @Test
    public void reversedTestDigit(){
        Assert.assertEquals("cba321", ReverseString.reverseString("123abc"));
        System.out.println("This is a passed test 2");
    }

    @Test
    public void reverseTesthappyPath(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
        System.out.println("This is a third test");
    }
}
