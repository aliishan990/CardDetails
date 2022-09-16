import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Card_Expiry {

    @Test(groups = {"group1"})
    public void card_Valid_Expiry(){
        System.out.println("Am inside card expiry");
    }

    @Test
    public void card_inValid_Expiry(){
        System.out.println("Test case fail");
    }

}
