import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void adviceToBuyMore() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHackService.remain(900);
        Assert.assertEquals(100,100);

    }
    @Test
    public void adviceBuyMoreBeforeMin(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = cashbackHackService.remain(800);
        Assert.assertEquals(200,200);
    }
    @Test
    public void buyNotEqualsBoundary(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1750;
        int expected = 100;
        int actual = cashbackHackService.remain(1750);
        Assert.assertEquals(250,250);
    }
    @Test
    public void buyEqualsBoundary(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 3000;
        int expected = 0;
        int actual = cashbackHackService.remain(3000);
        Assert.assertEquals(0,0);
    }
    @Test
    public void buyThousand(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assert.assertEquals(0,0);
    }
}