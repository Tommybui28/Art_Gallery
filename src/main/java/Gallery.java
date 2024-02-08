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

    public int stockCount(){
        return this.stock.size();
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);

    }
    public void removeArtwork(Artwork artwork){
        this.stock.remove(artwork);

    }


}
