import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Card_Details2 {

    @Test
    public void card_Valid_Details(){
        System.out.println("Test case pass"+Thread.currentThread().getId());
    }

    @BeforeTest
    public void card_inValid_Details(){
        System.out.println("Am Execute before test");
    }

    @Test
    public void card_cvv_Details(){
        System.out.println("Test case passed");
    }
}
