package algorithm.datastructure.Stack;

/**
 * notasi infix adalah notasi dimana operator berada diantara
 * operan yang diperlukan. notasi postfix adalah jenis notasi
 * dimana operator muncul setelah operan
 * 
 * ekspresi infix -> A + B * C + D
 * ke eksprei postfix menjadi -> ABC * + D +
 */
import java.util.Stack;

public class InfixToPostfix {

  public static String infixToPostfix(String ekspresiInfix) throws  Exception {
    if (!BalancedBracket.bracketSesuai(ekspresiInfix)) {
      throw new Exception("ekspresi salah");
    }
    StringBuilder output = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    for (char element : ekspresiInfix.toCharArray()) {
      if (Character.isLetterOrDigit(element)) {
        output.append(element);
      } else if (element == '(') {
        stack.push(element);
      } else if (element == ')') {
        while (!stack.isEmpty() && stack.peek() != '(') {
          output.append(stack.pop());
        }
        stack.pop();
      } else {
        while(!stack.isEmpty() && ekspresi(element) <= ekspresi(stack.peek())) {
          output.append(stack.pop());
        }
        stack.push(element);
      }      
    }
    while (!stack.isEmpty()) {
      output.append(stack.pop());
    }
    return output.toString();
  }

  private static int ekspresi(char operator) {
    switch (operator) {
      case '+':
      case '-':
        return 0;
      case '*':
      case '/':
        return 1;
      case '^':
        return 2;
      default:
        return -1;
    }
  }
  public static void main(String[] args) throws Exception {

  }
}
