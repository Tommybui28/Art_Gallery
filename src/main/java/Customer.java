public class Customer {
    private String name;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }
    public double getWallet(){
        return this.wallet;

    }


    public void buyArtwork(Gallery gallery, Artwork artwork){
        double salePrice = artwork.getPrice();
        this.wallet -= salePrice;
        double updatedTill = gallery.getTill() + salePrice;
        gallery.setTill(updatedTill);

    }

}
