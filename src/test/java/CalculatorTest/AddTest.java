package CalculatorTest;

import org.junit.Assert;
import org.junit.Test;
import static Calculator.Add.add;

public class AddTest {
    @Test
    public void TestAddMethod(){
        Assert.assertEquals(add(""),0);
        Assert.assertEquals(add("1"),1);
        Assert.assertEquals(add("2"),2);
    }
}
