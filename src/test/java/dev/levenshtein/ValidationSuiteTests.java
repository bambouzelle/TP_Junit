package dev.levenshtein;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(DistanceLevenshteinTest.class) // Spécifie la classe de tests
@IncludeTags("validation") // Inclut uniquement les tests marqués avec "validation"
public class ValidationSuiteTests {
}
