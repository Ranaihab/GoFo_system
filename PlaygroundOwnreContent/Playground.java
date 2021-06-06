package PlaygroundOwnreContent;
import GoFoSystem.*;
import java.util.ArrayList;



/**
 * This class is responsible for setting the playground info
 *
 */

public class Playground {

        public enum PlaygroundStatus{
            suspended,
            activate,
            deleted,
            requested,
            refused
        }
        private static  int count =0;
        private String name;
        private int ID;
        private Location location ;
        private int rating;
        private int size;
        private int price;
        private int noBooks;
        private int cancellationPeriod;
        private PlaygroundStatus status;
        private  ArrayList <String> complains;
        private ArrayList<Date> availableHours;
        private ArrayList<Book> books;
        private ArrayList <String> review;
        private Book book;
        private PlaygroundOwner playgroundOwner;


    /**
     * default constructor for initializing the attributes
     *
     */
        public Playground(){
                name = "";
                size = 0;
                price = 0;
                cancellationPeriod = 0;
                ID = ++count;
        }




    /**
     * parameterized constructor
     * @param name which take the name of the playground
     * @param location which take the location of the playground
     * @param size which take the size of the playground
     * @param price which take the price per hour of the playground
     * @param cancellationPeriod which take the cancellation period of the playground
     */

        public Playground(String name, Location location, int size,int price,  int cancellationPeriod, PlaygroundOwner playgroundOwner){
            this.name = name;
            this.location = location;
            this.size = size;
            this.availableHours = new ArrayList<>();
            this.price = price;
            this.cancellationPeriod = cancellationPeriod;
            this.playgroundOwner = playgroundOwner;
        }

    /**
     * get the playground name
     * @return name
     */
        public String getName() {
            return name;
        }

    /**
     * set the playground name
     * @param name
     */
        public void setName(String name) {
            this.name = name;
        }

    /**
     * get the playground location
     * @return location
     */
        public Location getLocation() {
            return location;
        }

    /**
     * set the playground location
     * @param location
     */

    public void setLocation(Location location) {
            this.location = location;
        }

    /**
     * get all the books for this playground
     * @return books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * add book to the playground
     * @param book
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * get the playgroundOwner
     * @return playgroundOwner
     */
    public PlaygroundOwner getPlaygroundOwner() {
        return playgroundOwner;
    }

    /**
     * set the playgroundOwner
     * @param playgroundOwner
     */
    public void setPlaygroundOwner(PlaygroundOwner playgroundOwner) {
        this.playgroundOwner = playgroundOwner;
    }

    /**
     * get the playground rate
     * @return rating
     */
        public int getRating() {
            return rating;
        }

    /**
     * set the playground rating
     * @param rating
     */
        public void setRating(int rating) {
            this.rating = rating;
        }

    /**
     * get the playground size
     * @return size
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
     * get the playground price
     * @return price
     */
        public int getPrice() {
            return price;
        }

    /**
     * set the playground price
     * @param price
     */

    public void setPrice(int price) {
            this.price = price;
        }

    /**
     * get the number of books in this playground
     * @return noBooks
     */
        public int getNoBooks() {
            return noBooks;
        }

    /**
     * set the number of books in this playground
     * @param noBooks
     */
    public void setNoBooks(int noBooks) {
            this.noBooks = noBooks;
        }

    /**
     * get the playground cancellation period
     * @return cancellationPeriod
     */
        public int getCancellationPeriod() {
            return cancellationPeriod;
        }

    /**
     * set the playground cancellation period
     * @param cancellationPeriod
     */
    public void setCancellationPeriod(int cancellationPeriod) {
            this.cancellationPeriod = cancellationPeriod;
        }

    /**
     * get the playground status
     * @return status
     */
    public PlaygroundStatus getStatus() {
            return status;
        }

    /**
     * set the playground status
     * @param status
     */
        public void setStatus(PlaygroundStatus status) {
            this.status = status;
        }

    /**
     * get the playground available hours
     * @return available hours
     */
    public ArrayList<Date> getAvailableHours() {
            return availableHours;
        }

    /**
     * set the playground available hours
     * @param availableHours
     */
        public void setAvailableHours(ArrayList<Date> availableHours) {
            this.availableHours = availableHours;
        }

    /**
     * get the playground complains array
     * @return complains
     */
    public ArrayList<String> getComplains() {
            return complains;
        }

    /**
     * set the playground complains array
     * @param complains
     */
        public void setComplains(ArrayList<String> complains) {
            this.complains = complains;
        }

    /**
     * get the playground review
     * @return review
     */
    public ArrayList<String> getReview() {
            return review;
        }

    /**
     * set the playground review
     * @param review
     */
        public void setReview(ArrayList<String> review) {
            this.review = review;
        }

    /**
     * get all the books in the playground
     * @return book
     */

    public Book getBook() {
        return book;
    }

    /**
     * set a book for the playground
     * @param book
     */

    public void setBook(Book book) {
            if (status == PlaygroundStatus.activate){
                this.book = book;
                noBooks++;
            }
        }

    /**
     * function which is responsible for deleting specific available hour for certain playground
     * @param DeleteHour
     */

    public void deleteHours(Date DeleteHour){
            availableHours.remove(DeleteHour);
        }

    /**
     * function which is responsible for setting specific available hour for certain playground
     * @param NewAvailableHour
     */
    public void addHours(Date NewAvailableHour){
            availableHours.add(NewAvailableHour);
        }

    /**
     * function which is responsible to view available hours for certain playground
     */
        public void viewAvailableHours(){
            System.out.println(availableHours);
        }

    /**
     *
     * @return string contain the whole information of specific playground
     */
        @Override
        public String toString(){
            return "There is available playground named " + name + "in " + location + "has " + size + "meters"
                    + "takes " + price + "pounds per hour" + "it's cancellation period is " +  cancellationPeriod + "\n";
        }
}
