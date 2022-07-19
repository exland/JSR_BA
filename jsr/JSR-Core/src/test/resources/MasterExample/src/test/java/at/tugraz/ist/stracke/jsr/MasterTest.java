package at.tugraz.ist.stracke.jsr;


import org.junit.Test;
import org.junit.Assert;

public class MasterTest {

    public MasterTest() {
    }


    @Test
    public void t1()
    {
        Master m = new Master();
        Assert.assertEquals(m.r2, "r2");
        Assert.assertEquals(m.r4, "r4");
        Assert.assertEquals(m.r5, "r5");

    }
    @Test
    public void t2()
    {
        Master m = new Master();
        Assert.assertEquals(m.r1, "r1");
        Assert.assertEquals(m.r3, "r3");

    }
    @Test
    public void t3()
    {
        Master m = new Master();
        Assert.assertEquals(m.r2, "r2");

    }
    @Test
    public void t4()
    {
        Master m = new Master();
        Assert.assertEquals(m.r1, "r1");
        Assert.assertEquals(m.r4, "r4");
        Assert.assertEquals(m.r5, "r5");
        Assert.assertEquals(m.r6, "r6");
    }
    @Test
    public void t5()
    {
        Master m = new Master();
        Assert.assertEquals(m.r2, "r2");
        Assert.assertEquals(m.r3, "r3");
    }


    @Test
    public void t6()
    {
        Master m = new Master();
        Assert.assertEquals(m.r4, "r4");
        Assert.assertEquals(m.r5, "r5");
        Assert.assertEquals(m.r6, "r6");
    }

    @Test
    public void t7()
    {
        Master m = new Master();
        Assert.assertEquals(m.r4, "r4");
        Assert.assertEquals(m.r5, "r5");
        Assert.assertEquals(m.r6, "r6");
    }


   /* @Test
    public void add() {
        Calculator calc = new Calculator("henri");
        Assert.assertEquals(10, calc.add(4, 6));
    }*/

}
