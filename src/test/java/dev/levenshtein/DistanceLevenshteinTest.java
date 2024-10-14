package dev.levenshtein;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Classe de test pour DistanceLevenshtein utilisant un fichier CSV.
 */
public class DistanceLevenshteinTest {

    // Attribut pour l'instance de DistanceLevenshtein
    private DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    // Test paramétré utilisant le fichier CSV
    @ParameterizedTest
    @CsvFileSource(resources = "/dev/levenshtein/DistanceLevenshtein.csv", numLinesToSkip = 1)
    public void calculerDistance(String mot1, String mot2, int distanceAttendue) {
        Assertions.assertEquals(distanceAttendue, distanceLevenshtein.calculerDistance(mot1, mot2));
    }
}
