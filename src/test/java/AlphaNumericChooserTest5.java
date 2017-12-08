import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphaNumericChooserTest5 {
    private AlphaNumericChooser chooser;

    @BeforeEach
    void setUp() {
        chooser = new AlphaNumericChooser(26, 10);
    }

    @Test
    void validInputReturnsProperLocation() throws Exception {
        AlphaNumericChooser.Location loc = chooser.locationFromInput("B4");

        assertEquals(1, loc.getRow());
        assertEquals(3, loc.getColumn());
    }

}