package creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("VisitCardWebsite");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
