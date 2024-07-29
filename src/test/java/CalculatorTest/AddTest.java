package CalculatorTest;

import org.junit.Assert;
import org.junit.Test;
import static Calculator.Add.add;

public class AddTest {
    @Test
    public void testAddEmptyString() {
        Assert.assertEquals(0, add(""));
    }

    @Test
    public void testAddSingleNumber() {
        Assert.assertEquals(1, add("1"));
        Assert.assertEquals(2, add("2"));
    }

    @Test
    public void testAddTwoNumbersSeparatedByComma() {
//        Assert.assertEquals(6, add("1,5"));
    }

    @Test
    public void testAddMultipleNumbersSeparatedByComma() {
//        Assert.assertEquals(34, add("5,7,9,10,1,2"));
    }
    @Test
    public void testAddMultipleNumbersSeparatedByCommaAndHavingNewLine() {
//        Assert.assertEquals(34, add("5,7\n9,10\n1,2"));
//        Assert.assertEquals(34, add("\n5\n7\n9,10\n1,2"));
//        Assert.assertEquals(-1, add("1,\n"));
//        Assert.assertEquals(-1, add("1,"));
//        Assert.assertEquals(-1, add("1,\n"));
//        Assert.assertEquals(-1, add(","));
    }
    @Test
    public void testAddWithDifferentDelimiter(){
        Assert.assertEquals(6, add("//;\n1;2\n3"));
        Assert.assertEquals(6, add("//*\n1*2*3"));
    }
}
