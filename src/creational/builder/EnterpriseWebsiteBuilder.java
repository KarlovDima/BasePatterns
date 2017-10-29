package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("EnterpriseWebsite");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
