package algorithm.datastructure.Stack;

/**
 * tanda kurung bersarang adalah problem dimana menentukan
 * apakah urutan tanda kurung bersarang dengan benar
 * urutan tanda kurung s dianggap benar bersarang
 * jika salah satu kondisi berikut
 * - S kosong
 * - s memiliki bentuk
 * (U) atau [U] atau {U}
 * dimana U ini adalah string bersarang yang benar
 */
import java.util.Stack;

class BalancedBracket {
  public static boolean telahTersambung(char bracketKiri, char bracketKanan) {
    char[][] bracketSambungan = {
      {'(', ')'},
      {'[', ']'},
      {'{', '}'},
      {'<', '>'},
    };
    for (char[] bracketTersambung : bracketSambungan) {
      if (bracketTersambung[0] == bracketKiri && bracketTersambung[1] == bracketKanan) {
        return true;
      }
    }
    return false;
  }

  public static boolean bracketSesuai(String brackets) {
    if (brackets == null) {
      throw new IllegalArgumentException("bracket null");
    }
    Stack<Character> bracketStack = new Stack<>();
    for (char bracket : brackets.toCharArray()) {
      switch (bracket) {
        case '(':
        case '{':
        case '[':
          bracketStack.push(bracket);
          break;
        case ')':
        case '}':
        case ']':
          if (bracketStack.isEmpty() || !telahTersambung(bracketStack.pop(), bracket)) {
            return false;
          }
          break;
        default:
          return false;
      }
    }
    return bracketStack.isEmpty();
  }

  public static void main(String[] arags) {
    assert bracketSesuai("[()]{}{[()()]()}");
    assert !bracketSesuai("[(])");
  }
}
