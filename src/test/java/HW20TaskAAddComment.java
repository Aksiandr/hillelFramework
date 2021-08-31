import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class HW20TaskAAddComment extends BaseTest {

    @Test
    public void testA() {

        getWebDriver().get("http://shop.demoqa.com/author/lsharm/");
        ShopDemoQaIsharmPageFactory iSharm = new ShopDemoQaIsharmPageFactory(getWebDriver());
        ShopDemoQaReadMorePageFactory readMore = new ShopDemoQaReadMorePageFactory(getWebDriver());
        ShopDemoQaErrorPageFactory errorMessage = new ShopDemoQaErrorPageFactory(getWebDriver());

        iSharm.goToReadMore();
        readMore.setAuthorInput("Oksana");
        readMore.setEmailInput("oksanakhalilova@gmail.com");
        readMore.setCommentInput("Comment from Oksana");
        readMore.clickOnAcceptCheckButton();
        readMore.clickOnAddCommentButton();

        Assert.assertEquals(errorMessage.readErrorMessage(),
                "Error: You entered an incorrect CAPTCHA answer. Please go back and try again.");

    }

}
