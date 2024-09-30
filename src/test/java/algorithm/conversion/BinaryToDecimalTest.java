package algorithm.conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import algorithm.conversions.BinaryToDecimal;

public class BinaryToDecimalTest {
    @Test
    public void testBinaryToDecimal() {
        assertEquals(0, BinaryToDecimal.binerKeDesimal(0));
        assertEquals(512,BinaryToDecimal.binerKeDesimal(1000000000));
    }

    @Test
    public void testAngkaNegatif() {
        assertEquals(-1, BinaryToDecimal.binerKeDesimal(-1));
    }

    @ParameterizedTest
    @CsvSource({"2", "1234", "11112", "101021"})
    void testAngkaBinerSalah(long angkaBiner) {
        assertThrows(IllegalArgumentException.class, () -> BinaryToDecimal.binerKeDesimal(angkaBiner));
    }
}
