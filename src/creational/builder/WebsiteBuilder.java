package creational.builder;

public abstract class WebsiteBuilder {
    protected Website website;

    public WebsiteBuilder createWebsite() {
        website = new Website();
        return this;
    }

    public Website getWebsite() {
        return website;
    }

    abstract WebsiteBuilder buildName();

    abstract WebsiteBuilder buildCms();

    abstract WebsiteBuilder buildPrice();
}

