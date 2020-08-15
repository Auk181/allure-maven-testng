package smoke.test;



import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.functional.AddFunctionClass;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Test")
public class UnitTestClass {

    @Test(groups={"functional"}, dependsOnGroups = "sanity")
    @Story("Functional Test")
    public void checkForAddFunction(){
        boolean flag = new AddFunctionClass().add(3,4);
        Assert.assertEquals(true,flag);
    }

    @Test(groups={"sanity"})
    @Story("Sanity Test")
    public void checkForSanity(){
        boolean flag = new AddFunctionClass().add(3,4);
        Assert.assertEquals(true,flag);
    }
}
