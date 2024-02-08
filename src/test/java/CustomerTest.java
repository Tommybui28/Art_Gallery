import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artist vanGogh;
    Artist daVinci;
    Artwork artwork1;
    Artwork artwork2;


    @BeforeEach
    public void setUp(){
        customer = new Customer("Colin", 1000.00);
        gallery = new Gallery("BNTA");
        vanGogh = new Artist("vanGogh");
        daVinci = new Artist("daVinci");
        artwork1 = new Artwork("artwork1", vanGogh, 500);
        artwork2 = new Artwork("artwork2", daVinci, 300);
    }
    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000.00);
    }

    @Test
    public void canBuyArtwork(){
        int initial_size_customer_collection = customer.artCollectionCount();
        int initial_size_gallery_collection = gallery.stockCount();
        customer.buyArtwork(gallery, artwork1);
        assertThat(customer.getWallet()).isEqualTo(500);
        assertThat(gallery.getTill()).isEqualTo(500);
        assertThat(customer.artCollectionCount()).isEqualTo(1);
        assertThat(gallery.stockCount()).isEqualTo(0);
    }
    @Test
    public void canCountArtCollection(){
        assertThat(customer.artCollectionCount()).isEqualTo(0);
    }
    @Test
    public void canAddToArtCollection(){
        customer.addArtworkToCollection(artwork1);
        assertThat(customer.artCollectionCount()).isEqualTo(1);
    }
}
