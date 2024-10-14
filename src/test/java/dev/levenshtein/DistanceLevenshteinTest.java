package dev.levenshtein;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DistanceLevenshteinTest {

    private DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    // Tests vérifiant le calcul de la distance
    @Test
    @Tag("distance")
    public void testCalculerDistanceChatChats() {
        assertEquals(1, distanceLevenshtein.calculerDistance("chat", "chats"));
    }

    @Test
    @Tag("distance")
    public void testCalculerDistanceJavaJee() {
        assertEquals(3, distanceLevenshtein.calculerDistance("java", "jee"));
    }

    // Tests vérifiant la validité des entrées (exceptions)
    @Test
    @Tag("validation")
    public void testPremierParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "test");
        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    @Tag("validation")
    public void testSecondParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("test", null);
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }
}

