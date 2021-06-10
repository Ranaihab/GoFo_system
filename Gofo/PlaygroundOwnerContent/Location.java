/**
 * @author Alaa Mahmoud Ebrahim
 * ID: 20190105
 * Group: 12
 * @author Rana Ihab Ahmed Fahmy
 * ID: 20190207
 * Group: 12
 * @author Habeba Rabie Hassan
 * ID: 20190167
 * Group: 11
 */

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
     * parameterized constructor.
     * @param street where the location is.
     * @param city where the location is.
     */
    public Location(String street, String city) {
        this.street = street;
        this.city = city;
    }

    /**
     * get the street in the location.
     * @return street.
     */
    public String getStreet() {
        return street;
    }

    /**
     * set the street in the location.
     * @param street where the location is.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * get the city in the location.
     * @return city.
     */
    public String getCity() {
        return city;
    }

    /**
     * set the city in the location.
     * @param city where the location is.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return string contains the data of the playground.
     */
    @Override
    public String toString() {
        return "The location of this playground is in street: " +
                street + ", city: " +
                city;
    }
}
