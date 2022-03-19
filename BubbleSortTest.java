import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


 

public class BubbleSortTest {

    private BubbleSort c;

 
    @Before

    public void Before() throws Exception {
    	
        c = new BubbleSort();

    }

    @Test

    public void test() {

        int arr1[] = new int[]{1,6,2,2,5};
        int arr2[]=new int[]{10,13,3,2,1,3};

        int arr1Result[] = new int[]{1,2,2,5,6};
        int arr2Result[]=new int[]{1,2,3,3,10,13};

        assertEquals(Arrays.toString(arr1Result), Arrays.toString(c.BubbleSort(arr1)));
        assertEquals(Arrays.toString(arr2Result), Arrays.toString(c.BubbleSort(arr2)));      

    }

    @After

    public void After() throws Exception {
        c = null;

    }

}
