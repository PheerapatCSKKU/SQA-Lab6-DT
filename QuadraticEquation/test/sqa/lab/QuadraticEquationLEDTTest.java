package sqa.lab;

/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#6.1 - Limited Entry Decision Table
 * ชื่อ: พีรพัฒน์ ป้องกันยา
 * รหัสนักศึกษา: 673380053-3
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class QuadraticEquationLEDTTest {

    private final QuadraticEquation quadraticEquation = new QuadraticEquation();

    @DisplayName("Lab 6.1 - Limited Entry Decision Table")
    @ParameterizedTest(name = "{0} [Rule#{1}] a={2}, b={3}, c={4} -> {5}")
    @CsvSource({
        "TC001, 2, 0,  5, 3, NOT_QUADRATIC",
        "TC002, 3, 0,  0, 7, NOT_QUADRATIC",
        "TC003, 6, 1,  5, 2, REAL_ROOTS",
        "TC004, 7, 1,  2, 1, EQUAL_ROOTS",
        "TC005, 8, 1,  1, 1, IMAGINARY_ROOTS"
    })
    void testDetermineRootNature(String testCaseId, int ruleNo, int a, int b, int c, RootNature expected) {
        assertEquals(expected, quadraticEquation.determineRootNature(a, b, c));
    }
}
