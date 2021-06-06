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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Playground> getPlaygrounds() {
        return playgrounds;
    }

    public void setPlaygrounds(ArrayList<Playground> playgrounds) {
        this.playgrounds = playgrounds;
    }

    public void viewBooks(){
        System.out.println(books);
    }

    public void viewPlaygrounds(){
        System.out.println(playgrounds);
    }

    public void addPlayground(Playground playground){
        playgrounds.add(playground);
    }

    public void addBook(Book book){
        books.add(book);
    }

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
        }

    }
}
