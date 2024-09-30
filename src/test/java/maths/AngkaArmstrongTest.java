package maths;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class AngkaArmstrongTest {
  @Test
  void testAdalahAngkaArmstrong() {
    AngkaArmstrong armstrong = new AngkaArmstrong();
    assertThat(armstrong.adalahArmstrong(0)).isTrue();
    assertThat(armstrong.adalahArmstrong(200)).isFalse();
    assertThat(armstrong.adalahArmstrong(371)).isTrue();
  }
}
