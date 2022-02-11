package Entities;

public abstract class BaseHouse {
    private int id;
    private int price;
    private int squareMeter;
    private int numberOfRooms;
    private int numberOfHalls;
    private String name;


    public BaseHouse(int id, int price, int squareMeter, int numberOfRooms, int numberOfHalls, String name) {
        this.id = id;
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
        this.name = name;
    }

    public BaseHouse() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public int getSquareMeter() {

        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {

        this.squareMeter = squareMeter;
    }

    public int getNumberOfRooms() {

        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {

        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHalls() {

        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {

        this.numberOfHalls = numberOfHalls;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
