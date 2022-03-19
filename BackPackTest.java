import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class BackPackTest {

    private BackPack c;

    @Before

    public void Before() throws Exception {

        c = new BackPack();

    }

    @Test

    public void test() {

    int m = 10;
    int n = 3;
    int w[] = {3, 4, 5};
    int p[] = {4, 5, 6};

    int arr[][] = {
    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},

            {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4},

            {0, 0, 0, 4, 5, 5, 5, 9, 9, 9, 9},

            {0, 0, 0, 4, 5, 6, 6, 9, 10, 11, 11}
            };

        Assert.assertArrayEquals(arr,c.BackPack_Solution(m, n, w, p));     

    }

    @After

    public void After() throws Exception {

        c = null;

    }

}