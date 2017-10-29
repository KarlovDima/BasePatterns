package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    EnterpriseWebsiteBuilder buildName() {
        website.setName("EnterpriseWebsite");
        return this;
    }

    @Override
    EnterpriseWebsiteBuilder buildCms() {
        website.setCms(CMS.ALIFRESCO);
        return this;
    }

    @Override
    EnterpriseWebsiteBuilder buildPrice() {
        website.setPrice(10000);
        return this;
    }
}
