package testsuite;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParamTest {
	@Parameters({ "browser" })
    @Test
    public void optionalTest(@Optional("Firefox") String value) {
        System.out.println("Browser is: " + value);
    }

}
