import org.testng.Assert;
import org.testng.annotations.*;

public class Card_Details1Test {

    @DataProvider(name = "sample_data")
    public Object[][] providermethod(){
        return new Object[][]{{"Ishan",99},{"Rahul",98},{"sam",77}};
    }

    @Test(dataProvider = "sample_data")
    public void marks_Details(String name,int marks){
        //System.out.println("Test case c_pass"+Thread.currentThread().getId());
        System.out.println("Name : "+name+" Marks : "+marks);
    }

    @Test(groups = {"group1"})
    public void b_card_inValid_Details(){
        System.out.println("Test case b_passed");
    }

    @Test
    public void a_card_cvv_Details(){
        boolean a=false;
        System.out.println("Test case a_passed");
        Assert.assertNotEquals(2,4,"Test_case cvv_details is not as expected");
        Assert.assertFalse(a,"assert true failed");
        //Assert.fail("carddetails failed");



    }

    /*@BeforeSuite
    @BeforeTest
    @BeforeClass
    @BeforeMethod
    @AfterMethod
    @AfterClass
    @AfterTest
    @AfterSuite*/

    /*@Test
    @Parameters("Fullname")
    public void ab_card_cvv_Details(String username){
        System.out.println("Name of the user is "+username);
    }*/

}


