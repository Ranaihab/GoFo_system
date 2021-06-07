package GoFoSystem;
import PlaygroundOwnreContent.Book;
import PlaygroundOwnreContent.Playground;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * class is responsible for holding all the data of the system.
 */
public class GoFo {
    private ArrayList<Player> players;
    private ArrayList<PlaygroundOwner> owners;
    private ArrayList<Playground> playgrounds;
    private ArrayList<Book> books;
    private Adminstrator admin;

    public GoFo()
    {
        this.admin = admin;
        players = new ArrayList<Player>(0);
        playgrounds = new ArrayList<Playground>(0);
        owners = new ArrayList<PlaygroundOwner>(0);
        books = new ArrayList<Book>(0);
    }
    /**
     * constructor for GoFo class.
     * @param admin will be the administrator of the system.
     */
    public GoFo(Adminstrator admin){
        this.admin = admin;
        players = new ArrayList<Player>(0);
        playgrounds = new ArrayList<Playground>(0);
        owners = new ArrayList<PlaygroundOwner>(0);
        books = new ArrayList<Book>(0);
    }
    
    public ArrayList<Player> getPlayers()
    {
    	return players;
    }
    
    public ArrayList<Playground> getPlaygrounds()
    {
    	return playgrounds;
    }
    
    public ArrayList<PlaygroundOwner> getOwners()
    {
    	return owners;
    }
    
    public ArrayList<Book> getBooks()
    {
    	return books;
    }
    
    /**
     * This function prints all the books that are on the system so that another player can join the team.
     */
    public void viewBooks(){
        for(int i = 0; i<books.size(); i++){
            books.get(i).print();
        }
    }

    /**
     * This function prints all the playgrounds that are registered on the system so that a player can book them.
     */
    public void viewPlaygrounds(){
        for(int i = 0; i<playgrounds.size(); i++){
            playgrounds.get(i).toString();
        }
    }

    /**
     * Prints the playgrounds that are in this city.
     * @param city the city that we want the playgrounds that are in it.
     */
    public void filterByLocation(String city){
        for(int i = 0; i<playgrounds.size(); i++){
            if(playgrounds.get(i).getLocation().getCity().equalsIgnoreCase(city)) {
                playgrounds.get(i).toString();
            }
        }
    }

    //TODO
    /*public void filterByHours(String city){
        for(int i = 0; i<playgrounds.size(); i++){
            if(playgrounds.get(i).getLocation().getCity().equals(city))
                playgrounds.get(i).print();
        }
    }*/

    /**
     * Add to the system the playground that is registered so it could be viewed later by the player.
     * @param pg playground to be added to the system.
     */
    public void addPlayground(Playground pg){
        playgrounds.add(pg);
    }

    /**
     * Add to the system the book that is booked by a player so it could be viewed later by the player.
     * @param book to be added to the system.
     */
    public void addPBook(Book book){
        books.add(book);
    }

    /**
     * It removes the book from the system if it is canceled or refused.
     * @param book to be removed.
     */
    public void removeBook(Book book){
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).getId() == book.getId()){
                books.remove(i);
                break;
            }
        }
    }

    /**
     * It removes the playground from the system if it is deleted by the admin.
     * @param pg playground to be deleted.
     */
    public void removePlayground(Playground pg){
        for(int i = 0; i<playgrounds.size(); i++){
            if(playgrounds.get(i).getID() == pg.getID()){
                playgrounds.remove(i);
                break;
            }
        }
    }

    /**
     * It is used to register a player or playground owner in the system.
     */
    public void register(){
        System.out.print("Do you want to register as a player or playground owner: ");
        Scanner input= new Scanner(System.in);
        String x = input.nextLine();
        if(x.equalsIgnoreCase("player")){
            System.out.print("Please Enter your email: ");
            x = input.nextLine();
            boolean isExist = false;

            for(int i = 0; i<players.size(); i++){
                if(players.get(i).getMail().equalsIgnoreCase(x)){
                    System.out.println("User already exists");
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Password: ");
                String pass = input.nextLine();
                System.out.print("Phone: ");
                String phone = input.nextLine();
                System.out.print("ID: ");
                int ID = input.nextInt();
                input.nextLine();
                System.out.print("Location City: ");
                String city = input.nextLine();
                System.out.print("Location street: ");
                String street = input.nextLine();
                Location loc = new Location(city, street);
                User player = new Player(name, ID, x,pass, phone, loc);	
                players.add((Player) player);	
            }
        }
        else if(x.equalsIgnoreCase("playground owner")){

            System.out.print("Please Enter your email: ");
            x = input.nextLine();
            boolean isExist = false;

            for(int i = 0; i<owners.size(); i++){
                if(owners.get(i).getMail().equalsIgnoreCase(x)){
                    System.out.println("User already exists");
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Password: ");
                String pass = input.nextLine();
                System.out.print("Phone: ");
                String phone = input.nextLine();
                System.out.print("ID: ");
                int ID = input.nextInt();
                input.nextLine();
                System.out.print("Location City: ");
                String city = input.nextLine();
                System.out.print("Location street: ");
                String street = input.nextLine();
                Location loc = new Location(city, street);
                //User owner = new PlaygroundOwner(name, ID, pass, x, phone, loc);
                //owners.add(owner);
            }
        }

    }
};
