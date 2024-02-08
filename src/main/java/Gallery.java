import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();

    }

    public double getTill() {
        return till;
    }

    public void setTill(double amount) {
        this.till = amount;
    }

}
