package creational.builder;

public class Director {
    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite(){
        builder.createWebsite().buildName().buildCms().buildPrice();

        return builder.getWebsite();
    }
}
