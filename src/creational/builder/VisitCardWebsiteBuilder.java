package creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    VisitCardWebsiteBuilder buildName() {
        website.setName("VisitCardWebsite");
        return this;
    }

    @Override
    VisitCardWebsiteBuilder buildCms() {
        website.setCms(CMS.WORDPRESS);
        return this;
    }

    @Override
    VisitCardWebsiteBuilder buildPrice() {
        website.setPrice(500);
        return this;
    }
}
