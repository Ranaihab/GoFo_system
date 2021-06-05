import GoFo.src.GoFoSystem.AvailableHours;

import java.util.ArrayList;

enum PlaygroundStatus{
    suspended, activate, deleted, requested, refused
}

public class Playground {
        private String name;
        private Location location ;
        private int rating;
        private int size;
        private int price;
        private int noBooks;
        private int cancellationPeriod;
        private PlaygroundStatus status;
        private  ArrayList <String> complains;
        private ArrayList<AvailableHours> availableHours;
        private ArrayList <String> review;
//        private Book book;



        public Playground(){
                name = "";
                size = 0;
                price = 0;
                cancellationPeriod = 0;
        }

        public Playground(String name, Location location, int size,int price,  int cancellationPeriod){
            this.name = name;
            this.location = location;
            this.size = size;
            this.availableHours = new ArrayList<>();
            this.price = price;
            this.cancellationPeriod = cancellationPeriod;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getNoBooks() {
            return noBooks;
        }

        public void setNoBooks(int noBooks) {
            this.noBooks = noBooks;
        }

        public int getCancellationPeriod() {
            return cancellationPeriod;
        }

        public void setCancellationPeriod(int cancellationPeriod) {
            this.cancellationPeriod = cancellationPeriod;
        }

        public PlaygroundStatus getStatus() {
            return status;
        }

        public void setStatus(PlaygroundStatus status) {
            this.status = status;
        }

        public ArrayList<AvailableHours> getAvailableHours() {
            return availableHours;
        }

        public void setAvailableHours(ArrayList<AvailableHours> availableHours) {
            this.availableHours = availableHours;
        }
        public ArrayList<String> getComplains() {
            return complains;
        }

        public void setComplains(ArrayList<String> complains) {
            this.complains = complains;
        }
        public ArrayList<String> getReview() {
            return review;
        }

        public void setReview(ArrayList<String> review) {
            this.review = review;
        }

//        public Book getBook() {
//            return book;
//        }
//
//        public void setBook(Book book) {
//            if (status == PlaygroundStatus.activate){
//                this.book = book;
//            }
//        }

        public void deleteHours(AvailableHours DeleteHour){
            availableHours.remove(DeleteHour);
        }
        public void addHours(AvailableHours NewAvailableHour){
            availableHours.add(NewAvailableHour);
        }

        public void viewAvailableHours(){
            System.out.println(availableHours);
        }

        @Override
        public String toString(){
            return "There is available playground named " + name + "in " + location + "has " + size + "meters"
                    + "takes " + price + "pounds per hour" + "it's cancelation period is " +  cancellationPeriod + "\n";
        }
}
