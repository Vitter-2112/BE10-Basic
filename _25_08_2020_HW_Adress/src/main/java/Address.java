public class Address {
    String  Street;
         int  Home;
           String City;

    public Address() {
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setHome(int home) {
        Home = home;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public int getHome() {
        return Home;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", Home=" + Home +
                ", City='" + City + '\'' +
                '}';
    }
}
