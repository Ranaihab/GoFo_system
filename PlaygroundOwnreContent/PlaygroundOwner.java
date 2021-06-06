package PlaygroundOwnreContent;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class is responsible for setting the playground owner information
 */
public class PlaygroundOwner {
        private static  int count =0;
        private String name;
        private int ID;
        private String password;
        private String email;
        private String phone;
        private Location location;
        private ArrayList<Book> books;
        private ArrayList<Playground> playgrounds;

    /**
     * parametrized constructor to set the information of the playground owner
     * @param name name of the playground owner
     * @param password password of his account
     * @param email email he want to register with
     * @param phone his phone number
     * @param location his location
     * @param books the books in his playgrounds
     * @param playgrounds his playgrounds
     */
    public PlaygroundOwner(String name, String password, String email, String phone, Location location, ArrayList<Book> books, ArrayList<Playground> playgrounds) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.books = books;
        this.playgrounds = playgrounds;
        ID = ++count;
    }

    /**
     *
     * @return name of the playground owner
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of the playground owner
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return password of the playground owner account
     */

    public String getPassword() {
        return password;
    }

    /**
     * set the password of the playground owner account
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get the email of the playground owner account
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * set the email of the playground owner account
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get the phone number of the playground owner
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set the phone number of the playground owner
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get the location of the playground owner
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * set the location of the playground owner
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * get all the book of the playgrounds that is owned by this user
     * @return books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }
    /**
     * set all the book of the playgrounds that is owned by this user
     * @return books
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * get all the playgrounds that is owned by this user
     * @return
     */
    public ArrayList<Playground> getPlaygrounds() {
        return playgrounds;
    }
    /**
     * set all the playgrounds that is owned by this user
     * @return
     */
    public void setPlaygrounds(ArrayList<Playground> playgrounds) {
        this.playgrounds = playgrounds;
    }

    /**
     * this function is responsible for viewing all the books
     */
    public void viewBooks(){
        System.out.println(books);
    }
    /**
     * this function is responsible for viewing all the playgrounds
     */
    public void viewPlaygrounds(){
        System.out.println(playgrounds);
    }
    /**
     * this function is responsible for adding playground
     * @param playground
     */
    public void addPlayground(Playground playground){
        playgrounds.add(playground);
    }

    /**
     * this function is responsible for adding book to playground
     * @param book
     */

    public void addBook(Book book, Playground playground){
        books.add(book);
        playground.addBook(book);
    }

    /**
     * this function is responsible for accepting or refusing the book requests
     * @param book
     */

    public boolean accept_refuseBooks(Book book){
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();
        System.out.println("please enter your choice whether accept or refuse");
        if(userChoice.equalsIgnoreCase("accept")){
            book.setStatus(Book.BookStatus.accepted);
            return true;
        }
        else if(userChoice.equalsIgnoreCase("refuse")){
            book.setStatus(Book.BookStatus.refused);
            return false;
        }else{
            System.out.println("you need to choose whether accept or refuse, the playground status has been set to be pending");
            book.setStatus(Book.BookStatus.pending);
            return false;
        }

    }
}
