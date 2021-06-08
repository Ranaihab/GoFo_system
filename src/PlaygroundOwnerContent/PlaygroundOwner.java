package PlaygroundOwnerContent;
import java.util.ArrayList;
import java.util.Scanner;
import GoFoSystem.*;
/**
 * This class is responsible for setting the playground owner information
 */
public class PlaygroundOwner extends User {
        private static  int count =0;
   
        private ArrayList<Book> books;
        private ArrayList<Playground> playgrounds;
        
        /**
         * parametrized constructor to set the information of the playground owner
         * @param name name of the playground owner
         * @param password password of his account
         * @param mail email he want to register with
         * @param phone his phone number
         * @param loc his location
         */
        public PlaygroundOwner(String name, int id, String mail, String password, String phone, Location loc, double money)
    	{
    		super(name,id,mail,password,phone,loc, money);
    		books = new ArrayList<>(0);
            playgrounds = new ArrayList<>(0);
            ID = ++count;
    		
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
     * @return an array of the playgrounds
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
        for(int i = 0; i< books.size(); i++){
            books.get(i).print();
            System.out.println();
        }
    }
    /**
     * this function is responsible for viewing all the playgrounds
     */
    public void viewPlaygrounds(){
        for(int i = 0; i< playgrounds.size(); i++){
            System.out.println(playgrounds.get(i).toString());
            System.out.println();
        }
    }

    /**
     * this function is responsible for adding playground
     */
    public void addPlayground(){
        Scanner input = new Scanner(System.in);
        System.out.print("Playground name: ");
        String name = input.nextLine();
        System.out.print("Playground Location city: ");
        String city = input.nextLine();
        System.out.print("Playground Location street: ");
        String Street = input.nextLine();
        Location loc = new Location(Street, city);
        System.out.print("Playground capacity: ");
        int size = input.nextInt();
        input.nextLine();
        System.out.print("Playground price per hour: ");
        int price = input.nextInt();
        input.nextLine();
        System.out.print("Playground cancellation period in days: ");
        int day = input.nextInt();
        input.nextLine();
        ArrayList<Date> slots = new ArrayList<>(0);
        while(true){
            System.out.print("Do you want to add available hours(yes/no): ");
            String choice = input.nextLine();
            if(choice.equalsIgnoreCase("no")) {
                break;
            }
            System.out.print("Day of available date: ");
            int dayd = input.nextInt();
            input.nextLine();

            System.out.print("Hour of available date: ");
            int hour = input.nextInt();
            input.nextLine();

            System.out.print("Minute of available date: ");
            int minute= input.nextInt();
            input.nextLine();

            System.out.print("Month of available date: ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Year of available date: ");
            int year = input.nextInt();
            input.nextLine();
            Date date = new Date(hour, minute, dayd, month, year);
            slots.add(date);
        }

        Playground playground = new Playground(name, loc, size, price, day, this, slots);
        playgrounds.add(playground);
    }

    /**
     * this function is responsible for adding book to playground
     * @param book
     */

    public void addBook(Book book){
        books.add(book);
    }

    /**
     * this function is responsible for accepting or refusing the book requests
     * @param book
     */

    public boolean accept_refuseBooks(Book book){
        Scanner userInput = new Scanner(System.in);
        System.out.print("please enter your choice whether accept or refuse this book: ");
        String userChoice = userInput.nextLine();
        if(userChoice.equalsIgnoreCase("accept")){
            book.setStatus(Book.BookStatus.accepted);
            return true;
        }
        if(userChoice.equalsIgnoreCase("refuse")){
            book.setStatus(Book.BookStatus.refused);
            return false;
        }
        return false;
    }
}