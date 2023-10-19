import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testSum1(){
        Calc calc = new Calc();
        int actual = calc.sum(1,1000);
        Assertions.assertEquals(1001, actual);
    }
    @Test
    public void testSum2(){
        Calc calc = new Calc();
        int actual = calc.sum(-1,1000);
        Assertions.assertEquals(999, actual);
    }
    @Test
    public void testSum3(){
        Calc calc = new Calc();
        int actual = calc.sum(1,-1000);
        Assertions.assertEquals(-999, actual);
    }
    @Test
    public void testSum4(){
        Calc calc = new Calc();
        int actual = calc.sum(-1,-1000);
        Assertions.assertEquals(-1001, actual);
    }
    @Test
    public void testSubtraction1(){
        Calc calc = new Calc();
        int actual = calc.subtraction(1,1000);
        Assertions.assertEquals(999, actual);
    }
    @Test
    public void testSubtraction2(){
        Calc calc = new Calc();
        int actual = calc.subtraction(-1,1000);
        Assertions.assertEquals(1001, actual);
    }
    @Test
    public void testSubtraction3(){
        Calc calc = new Calc();
        int actual = calc.subtraction(1,-1000);
        Assertions.assertEquals(-1001, actual);
    }
    @Test
    public void testSubtraction4(){
        Calc calc = new Calc();
        int actual = calc.subtraction(-1,-1000);
        Assertions.assertEquals(-999, actual);
    }
    @Test
    public void testSubtraction5(){
        Calc calc = new Calc();
        double actual = calc.subDouble(1.2,1000.5);
        Assertions.assertEquals(999.3, actual);
    }
    @Test
    public void multiplication1(){
        Calc calc = new Calc();
        int actual = calc.multi(2,5);
        Assertions.assertEquals(10, actual);
    }
    @Test
    public void multiplication2(){
        Calc calc = new Calc();
        int actual = calc.multi(0,5);
        Assertions.assertEquals(0, actual);
    }
    @Test
    public void division(){
        Calc calc= new Calc();
        int actual = calc.division(9,3);
        Assertions.assertEquals(3, actual);
    }
}
