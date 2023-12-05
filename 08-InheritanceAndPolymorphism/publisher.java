public class publisher {

    protected String publisherName;
    protected String city;

    public publisher(String publisherName, String city) {
        this.publisherName = publisherName;
        this.city = city;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String display() {
        return "publisher [publisherName=" + publisherName + ", city=" + city + "]";
    }
    
}
