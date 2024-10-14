package dev.levenshtein;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(DistanceLevenshteinTest.class) // Spécifie la classe de tests
@IncludeTags("distance") // Inclut uniquement les tests marqués avec "distance"
public class DistanceSuiteTests {
}
