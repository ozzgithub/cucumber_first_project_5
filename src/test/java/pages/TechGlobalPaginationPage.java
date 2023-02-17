package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechGlobalPaginationPage extends TechGlobalBasePage {

    public TechGlobalPaginationPage() {
        super();
    }


        @FindBy(id = "main_heading")
        public WebElement headingText;

        @FindBy(id = "sub_heading")
        public WebElement sub_heading;

        @FindBy(id = "content")
        public WebElement content;

        @FindBy(id = "next")
        public WebElement nextButton;

        @FindBy(id = "previous")
        public WebElement previousButton;

        @FindBy(css = "div[class$='up2c0']>p")
        public List<WebElement> countryInfo;

        @FindBy(css = "img[class='city_image']")
        public WebElement countryImg;












}
