// import java.util.*;

// public class RomanToInteger {

//   private static Map<Character, Integer> map =
//       new HashMap<Character, Integer>() {
//         /** */
//         private static final long serialVersionUID = 87605733047260530L;

//         {
//           put('I', 1);
//           put('V', 5);
//           put('X', 10);
//           put('L', 50);
//           put('C', 100);
//           put('D', 500);
//           put('M', 1000);
//         }
//       };

//   /**
//    * fungsi merubah roman ke integer
//    *
//    * @param angka romawi
//    * @return integer
//    */
//   public static int romanToInt(String A) {

//     A = A.toUpperCase();
//     char prev = ' ';

//     int sum = 0;

//     int newPrev = 0;
//     for (int i = A.length() - 1; i >= 0; i--) {
//       char c = A.charAt(i);

//       if (prev != ' ') {
//         // memeriksa Nomor saat ini lebih besar dari sebelumnya atau tidak
//         newPrev = map.get(prev) > newPrev ? map.get(prev) : newPrev;
//       }

//       int currentNum = map.get(c);

//       // jika angka saat ini lebih besar dari sebelumnya maks sebelumnya maka tambahkan
//       if (currentNum >= newPrev) {
//         sum += currentNum;
//       } else {
//         // kurangi angka yang akan datang sampai angka yang akan datang tidak lebih besar dari sebelumnya maks
//         sum -= currentNum;
//       }

//       prev = c;
//     }

//     return sum;
//   }

//   public static void main(String[] args) {
//     int sum = romanToInt("MDCCCIV");
//     System.out.println(sum);
//   }
// }