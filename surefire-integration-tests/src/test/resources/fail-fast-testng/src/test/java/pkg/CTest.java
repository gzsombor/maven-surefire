package pkg;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CTest
{
    @Test
    public void test()
        throws InterruptedException
    {
        TimeUnit.MILLISECONDS.sleep(500);
    }

}