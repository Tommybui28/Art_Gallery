import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }
    public double getWallet(){
        return this.wallet;

    }

    public void addArtworkToCollection(Artwork artwork){
        this.artCollection.add(artwork);

    }
    public void buyArtwork(Gallery gallery, Artwork artwork){
        double salePrice = artwork.getPrice();
        this.wallet -= salePrice;
        double updatedTill = gallery.getTill() + salePrice;
        gallery.setTill(updatedTill);
        gallery.removeArtwork(artwork);
        this.artCollection.add(artwork);

    }
    public int artCollectionCount(){
        return this.artCollection.size();
    }



}
