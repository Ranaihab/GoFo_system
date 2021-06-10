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
import java.util.ArrayList;


/**
 * This class is responsible for setting the playground info.
 */

public class Playground {

    public enum PlaygroundStatus {
        suspended,
        activate,
        deleted,
        refused
    }

    private static int count = 0;
    private String name;
    private int ID;
    private Location location;
    private int rating;
    private int size;
    private int price;
    private int noBooks;
    private int cancellationPeriod;
    private PlaygroundStatus status;
    private ArrayList<Date> availableHours;
    private ArrayList<Book> books;
    private ArrayList<String> review;
    private PlaygroundOwner playgroundOwner;
    private int norate;


    /**
     * parameterized constructor for the playground class.
     * @param name  which take the name of the playground.
     * @param location which take the location of the playground.
     * @param size which take the size of the playground.
     * @param price which take the price per hour of the playground.
     * @param cancellationPeriod which take the cancellation period of the playground.
     */
    public Playground(String name, Location location, int size, int price, int cancellationPeriod, PlaygroundOwner playgroundOwner, ArrayList<Date> availableHours) {
        this.name = name;
        this.location = location;
        this.size = size;
        this.availableHours = new ArrayList<>(0);
        this.books = new ArrayList<>(0);
        this.review = new ArrayList<>(0);
        this.price = price;
        this.cancellationPeriod = cancellationPeriod;
        this.playgroundOwner = playgroundOwner;
        ID = ++count;
        norate = 0;
        rating = 0;
        this.availableHours = availableHours;
    }

    /**
     * get the playground name.
     * @return name of playground.
     */
    public String getName() {
        return name;
    }

    /**
     * set the playground name.
     * @param name the new name of playground.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * gets the ID of the playground.
     * @return id of playground.
     */
    public int getID() {
        return ID;
    }

    /**
     * get the playground location.
     * @return location that the playground exist in.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * set the playground location.
     * @param location new location of playground.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * get all the books for this playground.
     * @return books all the books that are booked for the playground.
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * add book to the playground.
     * @param book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * get the playgroundOwner.
     * @return playgroundOwner of the playground.
     */
    public PlaygroundOwner getPlaygroundOwner() {
        return playgroundOwner;
    }

    /**
     * get the playground rate.
     * @return rating of the playground
     */
    public int getRating() {
        return rating;
    }

    /**
     * modify the rating of the playground, calculates the new rating when a player rates the playground.
     * @param rating that the player rated for the playground.
     */
    public void setRating(int rating) {
        this.rating = (this.rating * norate + rating) / (norate + 1);
        norate++;
    }

    /**
     * get the playground size.
     * @return size of playground.
     */
    public int getSize() {
        return size;
    }

    /**
     * set the playground size
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * get the playground pric.e
     * @return price per hour.
     */
    public int getPrice() {
        return price;
    }

    /**
     * set the playground price.
     * @param price new price per hour.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * get the number of books in this playground.
     * @return noBooks number of books booked for the playground.
     */
    public int getNoBooks() {
        return noBooks;
    }


    /**
     * get the playground cancellation period
     * @return cancellationPeriod the time that the book can be cancelled within.
     */
    public int getCancellationPeriod() {
        return cancellationPeriod;
    }

    /**
     * set the playground cancellation period.
     * @param cancellationPeriod the time that the book can be cancelled within.
     */
    public void setCancellationPeriod(int cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }

    /**
     * get the playground status.
     * @return status the status of playground.
     */
    public PlaygroundStatus getStatus() {
        return status;
    }

    /**
     * set the playground status
     * @param status new status of playground.
     */
    public void setStatus(PlaygroundStatus status) {
        this.status = status;
    }

    /**
     * get the playground available hours.
     * @return available hours that a player can book this hours.
     */
    public ArrayList<Date> getAvailableHours() {
        return availableHours;
    }

    /**
     * set the playground available hours.
     * @param availableHours new hours for the playground.
     */
    public void setAvailableHours(ArrayList<Date> availableHours) {
        this.availableHours = availableHours;
    }


    /**
     * get the playground review.
     * @return reviews of playground.
     */
    public ArrayList<String> getReview() {
        return review;
    }

    /**
     * Add a review of a player to the playground.
     * @param review  of the player.
     */
    public void addReview(String review) {
        this.review.add(review);
    }


    /**
     * function which is responsible for deleting specific available hour for certain playground.
     * @param hours slots to be made unavailable.
     */
    public void deleteHours(Date[] hours) {
        for (int i = 0; i < hours.length; i++)
            for (int j = 0; j < availableHours.size(); j++) {
                if (hours[i] == availableHours.get(j)) {
                    availableHours.remove(j);
                }
            }
    }

    /**
     * function which is responsible for setting specific available hour for certain playground.
     * @param hours to be added to the available hours.
     */
    public void addHours(Date[] hours) {
        for (int j = 0; j < hours.length; j++) {
            availableHours.add(hours[j]);
        }
    }

    /**
     * function which is responsible to view available hours for certain playground.
     */
    public void viewAvailableHours() {
        for (int j = 0; j < availableHours.size(); j++) {
            System.out.println((j+1) + "- " +availableHours.get(j).toString());
        }
    }

    /**
     * @return string contain the whole information of specific playground.
     */
    @Override
    public String toString() {
        return "playground Id: " + ID + "\nname: " + name + "\nLocation: " + location + "\ncapacity: " + size
                + "\nprice: " + price + " pounds per hour" + "\nit's cancellation period in days is " + cancellationPeriod + "\nStatus: "
                + status + "\n";
    }
}
