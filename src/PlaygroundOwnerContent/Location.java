package PlaygroundOwnerContent;
import GoFoSystem.*;

/**
 * This class is responsible setting the location
 */
public class
Location {
    private String street;
    private String city;

    /**
     * parameterized constructor
     * @param street
     * @param city
     */
    public Location(String street, String city) {
        this.street = street;
        this.city = city;
    }

    /**
     * get the street in the location
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * set the street in the location
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * get the city in the location
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * set the city in the location
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return string contains the data of the playground
     */
    @Override
    public String toString() {
        return "The location of this playground is in street: " +
                street + ", city: " +
                city;
    }
}
