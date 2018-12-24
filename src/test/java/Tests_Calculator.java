import static org.junit.Assert.assertEquals;

public class Tests_Calculator
{
    //testing main functions +, - , *, /
    @org.junit.Test
    public void testPlus()
    {
        MetodCalc mc = new MetodCalc();
        int res= mc.calc(15, "+", 5);
        assertEquals(20, res);
    }
    @org.junit.Test
    public void test_Minus()
    {
        MetodCalc mc = new MetodCalc();
        int res=mc.calc(15, "-", 5);
        assertEquals(10, res);
    }
    @org.junit.Test
    public void test_Multiply()
    {
        MetodCalc mc = new MetodCalc();
        int res=mc.calc(15, "*", 5);
        assertEquals(75, res );
    }
    @org.junit.Test
    public void test_Divide()
    {
        MetodCalc mc = new MetodCalc();
        int res=mc.calc(15, "/", 5);
        assertEquals(3, res );
    }
    ///////////////division by zero//////////////////////
    @org.junit.Test (expected = ArithmeticException.class)
    public void test_Divide_zero()
    {
        MetodCalc mc = new MetodCalc();
        mc.calc(15, "/", 0);
    }

}