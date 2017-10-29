package creational.builder;

public abstract class WebsiteBuilder {
    protected Website website;

    public void createWebsite() {
        website = new Website();
    }

    public Website getWebsite() {
        return website;
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();
}

