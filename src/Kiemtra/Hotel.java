package Kiemtra;

public class Hotel {
    String name;
    String location;
    String owener;

    public Hotel() {
    }

    public Hotel(String name, String location, String owener) {
        this.name = name;
        this.location = location;
        this.owener = owener;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwener() {
        return owener;
    }

    public void setOwener(String owener) {
        this.owener = owener;
    }
}
