package GoFoSystem;

import PlaygroundOwnerContent.*;
import PlayerContent.*;

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

    public GoFo() {
        Adminstrator admin = new Adminstrator(this);
        this.admin = admin;
        players = new ArrayList<Player>(0);
        playgrounds = new ArrayList<Playground>(0);
        owners = new ArrayList<PlaygroundOwner>(0);
        books = new ArrayList<Book>(0);
    }

    /**
     * it returns the administrator of the system.
     * @return administrator.
     */
    public Adminstrator getAdmin() {
        return admin;
    }

    /**
     * @return the players in the system
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @return the playgrounds registered in the system
     */
    public ArrayList<Playground> getPlaygrounds() {
        return playgrounds;
    }

    /**
     * @return the owners registered in the system
     */
    public ArrayList<PlaygroundOwner> getOwners() {
        return owners;
    }

    /**
     * @return books made in the system
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * This function prints all the books that are on the system so that another player can join the team.
     */
    public void viewBooks() {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).print();
            System.out.println();
        }
    }

    /**
     * This function prints all the playgrounds that are registered on the system so that a player can book them.
     */
    public void viewAllPlaygrounds() {
        for (int i = 0; i < playgrounds.size(); i++) {
            System.out.println(playgrounds.get(i).toString());
            System.out.println();
        }
    }

    /**
     * This function prints all the activated playgrounds that are registered on the system so that a player can book them.
     */
    public void viewActivatedPlaygrounds() {
        for (int i = 0; i < playgrounds.size(); i++) {
            if (playgrounds.get(i).getStatus() == Playground.PlaygroundStatus.activate) {
                System.out.println(playgrounds.get(i).toString());
                System.out.println();
            }
        }
    }

    /**
     * Prints the playgrounds that are in this city.
     *
     * @param city the city that we want the playgrounds that are in it.
     */
    public void filterByLocation(String city) {
        for (int i = 0; i < playgrounds.size(); i++) {
            if (playgrounds.get(i).getLocation().getCity().equalsIgnoreCase(city) && playgrounds.get(i).getStatus() == Playground.PlaygroundStatus.activate) {
                System.out.print(playgrounds.get(i).toString());
                System.out.println();
            }
        }
    }


    public void filterByHours(int hours) {
        for (int i = 0; i < playgrounds.size(); i++) {
            for (int j = 0; j < playgrounds.get(i).getAvailableHours().size(); j++) {
                if (playgrounds.get(i).getAvailableHours().get(j).getHours() == hours) {
                    System.out.print(playgrounds.get(i).toString());
                    System.out.println();
                    break;
                }
            }
        }
    }

    /**
     * Add to the system the playground that is registered so it could be viewed later by the player.
     *
     * @param pg playground to be added to the system.
     */
    public void addPlayground(Playground pg) {
        playgrounds.add(pg);
    }

    /**
     * Add to the system the book that is booked by a player so it could be viewed later by the player.
     *
     * @param book to be added to the system.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * It removes the book from the system if it is canceled or refused.
     *
     * @param book to be removed.
     */
    public void removeBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                books.remove(i);
                break;
            }
        }
    }

    /**
     * It removes the playground from the system if it is deleted by the admin.
     *
     * @param pg playground to be deleted.
     */
    public void removePlayground(Playground pg) {
        for (int i = 0; i < playgrounds.size(); i++) {
            if (playgrounds.get(i).getID() == pg.getID()) {
                playgrounds.remove(i);
                break;
            }
        }
    }

    /**
     * It is used to register a player or playground owner in the system.
     */
    public Player playerRegister() {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your email: ");
        String x = input.nextLine();

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getMail().equalsIgnoreCase(x)) {
                System.out.println("User already exists");
                return players.get(i);
            }
        }

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
        System.out.print("Initial amount of money in E-Wallet: ");
        Double mon = input.nextDouble();
        input.nextLine();
        Player player = new Player(name, ID, x, pass, phone, loc, mon);
        players.add(player);
        return player;


    }

    public PlaygroundOwner ownerRegister() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your email: ");
        String x = input.nextLine();

        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i).getMail().equalsIgnoreCase(x)) {
                System.out.println("User already exists");
                return owners.get(i);
            }
        }

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
        System.out.print("Initial amount of money in E-Wallet: ");
        Double mon = input.nextDouble();
        input.nextLine();
        PlaygroundOwner owner = new PlaygroundOwner(name, ID, pass, x, phone, loc, mon);
        owners.add(owner);
        return owner;
    }
};
