package CalculatorTest;

import org.junit.Assert;
import org.junit.Test;
import static Calculator.Add.add;

public class AddTest {
    @Test
    public void testAddEmptyString() {
        try {
            Assert.assertEquals(0, add(""));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }

    @Test
    public void testAddSingleNumber() {
        try {
            Assert.assertEquals(1, add("1"));
            Assert.assertEquals(2, add("2"));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }

    @Test
    public void testAddTwoNumbersSeparatedByComma() {
        try {
            Assert.assertEquals(6, add("1,5"));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }

    @Test
    public void testAddMultipleNumbersSeparatedByComma() {
        try {
            Assert.assertEquals(34, add("5,7,9,10,1,2"));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }
    @Test
    public void testAddMultipleNumbersSeparatedByCommaAndHavingNewLine() {
        try {
            Assert.assertEquals(34, add("5,7\n9,10\n1,2"));
            Assert.assertEquals(34, add("\n5\n7\n9,10\n1,2"));
            Assert.assertEquals(-1, add("1,\n"));
            Assert.assertEquals(-1, add("1,"));
            Assert.assertEquals(-1, add("1,\n"));
            Assert.assertEquals(-1, add(","));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }
    @Test
    public void testAddWithDifferentDelimiter(){
        try {
            Assert.assertEquals(6, add("//;\n1;2\n3"));
            Assert.assertEquals(6, add("//*\n1*2*3"));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }

    @Test
    public void testAddWithNegativeNumbers(){
        try {
            Assert.assertEquals(-1, add("//*\n-1*2*-3"));
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
    }
}
