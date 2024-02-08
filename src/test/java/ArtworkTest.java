import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    Artwork artwork;
    Artist vanGogh;

    @BeforeEach
    public void setUp() {
        vanGogh = new Artist("vanGogh");
        artwork = new Artwork("artwork1",vanGogh, 500);
    }

    @Test
    public void canGetPrice() {
        assertThat(artwork.getPrice()).isEqualTo(500);
    }
}
