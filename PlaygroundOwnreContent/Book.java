package PlaygroundOwnreContent;
import GoFoSystem.*;

import java.util.ArrayList;

/**
 * This class contains all the information regarding a certain booking that happened.
 */
public class Book {
    public enum BookStatus{
        pending,
        accepted,
        refused
    }

    private Date slots[];
    private ArrayList<Player> players;
    private Playground playground;
    private Date bookDate;
    private BookStatus status;
    private int numberOfPlayers;
    private int id;
    private double price;
    private static  int count = 0;

    /**
     * Parameterized constructor to initialize the book.
     * @param slot the time the player will book.
     * @param player player that will book.
     * @param playground the playground that is being booked.
     * @param date time of booking.
     * @param no number of players that are going to play.
     */
    public Book(Date slot[], Player player, Playground playground, Date date, int no){
        id = ++count;
        slots = new Date[slot.length];
        for(int i = 0; i < slot.length; i++){
            slots[i] = slot[i];
        }

        players = new ArrayList<Player>(0);
        players.add(player);
        this.playground = playground;
        bookDate.setDay(date.getDay());
        bookDate.setHours(date.getHours());
        bookDate.setMinutes(date.getMinutes());
        bookDate.setMonth(date.getMonth());
        bookDate.setYear(date.getYear());

        if(no > playground.getSize()){
            System.out.println("Cannot Book because number of players is more than the playground's capacity");
        }
        else{
            price = (slot.length) * playground.getPrice();
            payMoney();
        }
    }

    /**
     * It sets the playground that we are booking for.
     * @param playground to be booked.
     */
    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    /**
     * @return the date of the booking.
     */
    public Date getBookDate(){
        return bookDate;
    }
    /**
     * It sets the state of the book (pending, refused, accepted).
     * @param status new state of the book.
     */
    public void setStatus(BookStatus status) {
        if(status == BookStatus.accepted && this.status == BookStatus.pending) {
            this.status = status;
            playground.addBook(this);
        }
        else if(status == BookStatus.refused){
            System.out.println("The owner refused the booking");
            this.status = status;
            playground.setHours(slots);
        }
    }

    /**
     * @return the id of the book.
     */
    public int getId() {
        return id;
    }

    /**
     * @return the current state of the book.
     */
    public BookStatus getStatus() {
        return status;
    }

    /**
     * This function is used when a registered player wants to join a booking.
     * @param player that is going to join the booking.
     * @return true if the player is added and false if not.
     */
    public boolean addPlayer(Player player){
        if(numberOfPlayers == playground.getSize()){
            System.out.println("Cannot add player because number of players is equal the playground's capacity");
            return false;
        }
        else{
            numberOfPlayers++;
            players.add(player);
            player.addBook(this);
            return true;
        }
    }

    /**
     * this function is used to pay for the playground.
     * it transfers the money from the player to the owner.
     * @return true if there is enough money to pay for the booking and false otherwise.
     */
    public boolean payMoney(){
        if(player.get(0).getEwallet() - price >= 0){
            player.transferMoney(price, playground.getPlaygroundOwner());
            playground.deleteHours(slots);
            playground.getPlaygroundOwner().addBook(this);
            return true;
        }
        else{
            System.out.println("Not enough money in the e-wallet to pay");
            return false;
        }
    }

    public void sendInvitation(){

    }

    /**
     * It prints the information of the booking.
     */
    public void print(){
        System.out.println("Booking ID: " + id);
        System.out.println("Booking price: " + price);
        System.out.println("Booking number of players: " + numberOfPlayers);
        for(int i = 0; i< slots.length; i++){
            System.out.println("Slot" + (i+1) +" " + slots[i].toString());
        }

        System.out.println("Booking playground: " + playground.getName());
        System.out.println("Booking booked in " + bookDate.toString());

        for(int i = 0; i< players.size(); i++){
            System.out.println("Player name " + (i+1) +" " + players.get(i).getName());
        }
    }
}