import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;
    Artwork artwork;
    Artist vanGogh;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("BNTA");
        vanGogh = new Artist("vanGogh");
        artwork = new Artwork("artwork1", vanGogh, 500);
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(10);
        assertThat(gallery.getTill()).isEqualTo(10);
    }

    @Test
    public void canGetStockCount(){
        assertThat(gallery.stockCount()).isEqualTo(0);
    }

    @Test
    public void canAddArtwork(){
        gallery.addArtwork(artwork);
        assertThat(gallery.stockCount()).isEqualTo(1);

    }
    @Test
    public void canRemoveArtwork(){
        gallery.addArtwork(artwork);
        gallery.removeArtwork(artwork);
        assertThat(gallery.stockCount()).isEqualTo(0);

    }
}
