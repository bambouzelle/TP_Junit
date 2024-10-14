package dev.levenshtein;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
/**
 * Classe de test pour DistanceLevenshtein utilisant un fichier CSV.
 */
public class DistanceLevenshteinTest {

    private DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    @Test
    public void testPremierParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "test");
        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    public void testPremierParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("", "test");
        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    public void testSecondParametreNull() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("test", null);
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    public void testSecondParametreVide() {
        AppException exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("test", "");
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }
}
