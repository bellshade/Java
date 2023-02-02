package algorith.Kombinasi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

public class KombinasiTest {
  @Test
  void testNoElement() {
    List<TreeSet<Integer>> result = kombinasi.combination(
      new Integer[] {1, 2},
      0
    );
    assertTrue(result == null);
  }
}
