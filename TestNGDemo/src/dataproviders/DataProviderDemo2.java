package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataProviderDemo2 {
    @Test(dataProvider="data")
    public void instanceDataProvider(int p1, String p2, String p3) {
        System.out.println(p1+", "+p2+", "+p3);
    }   
     
    @DataProvider(name="data")
    public Object[][] getData() {
        return new Object[][]{{5, "five","test1"}, {6, "six","test2"}};
    }
}
