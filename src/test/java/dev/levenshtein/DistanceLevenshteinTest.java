package dev.levenshtein;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Classe de test pour DistanceLevenshtein.
 */
public class DistanceLevenshteinTest {

    // Attribut pour l'instance de DistanceLevenshtein
    private DistanceLevenshtein distanceLevenshtein;

    // Tableau statique contenant les cas de test (mot1, mot2, distance attendue)
    private static Object[][] casDeTest;

    // Méthode exécutée une seule fois avant tous les tests pour initialiser le tableau de test
    @BeforeEach
    public void setUp() {
        distanceLevenshtein = new DistanceLevenshtein();

        // Initialisation du tableau de cas de test
        casDeTest = new Object[][]{
                {"chat", "chats", 1},
                {"machins", "machine", 1},
                {"java", "jee", 3}
        };
    }

    // Méthode de test pour le premier cas (chat et chats)
    @Test
    public void testCalculerDistanceChatChats() {
        assertEquals(casDeTest[0][2], distanceLevenshtein.calculerDistance((String) casDeTest[0][0], (String) casDeTest[0][1]));
    }

    // Méthode de test pour le deuxième cas (machins et machine)
    @Test
    public void testCalculerDistanceMachinsMachine() {
        assertEquals(casDeTest[1][2], distanceLevenshtein.calculerDistance((String) casDeTest[1][0], (String) casDeTest[1][1]));
    }

    // Méthode de test pour le troisième cas (java et jee)
    @Test
    public void testCalculerDistanceJavaJee() {
        assertEquals(casDeTest[2][2], distanceLevenshtein.calculerDistance((String) casDeTest[2][0], (String) casDeTest[2][1]));
    }
}
