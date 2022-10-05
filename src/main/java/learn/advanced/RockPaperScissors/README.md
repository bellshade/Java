# Game : Rock Paper Scissors

Rock Paper Scissors adalah game sederhana dimana kita memilih antara batu, gunting, atau kertas. Pilihan computer akan digenerate random oleh code.   
Jika pilihan kita berhasil mengalahkan pilihan computer, maka kita menang. Di akhir program akan ditampilkan berapa kali kita menang dan kalah.

## Alur Code
Berikut akan dijelaskan fungsi masing-masing code yagn ada didalam program ini


1. Pertama kita buat class enum yang berisi pilihan batu gunting kertas
```java
public enum Move {
  ROCK("rock"),
  PAPER("paper"),
  SCISSORS("scissors");

  private final String value;

  Move(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
```

2. Lakukan inisialisasi variable yang dibutuhkan. Jangan lupa karena kita menggunakan utility `Scanner` dan `Random` maka dibagian atas perlu di import terlebih dahulu.
```java
import java.util.Random;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
Random random = new Random();
int totalPlayerWin = 0;
int totalPlayerLosses = 0;
```

3. Buat method untuk cek pilihan computer yang digenerate secara random. `Move.values()[randomNumber].getValue` ini kita mengambil value dari class Enum Move berdasarkan index dari random number.
```java
private static String getComputerMove(Random random) {
  int randomNumber = random.nextInt(3);
  String computerMove = Move.values()[randomNumber].getValue();
  System.out.println("Computer choose : " + computerMove);

  return computerMove;
}
```

4. Buat method untuk cek apakah player menang atau kalah.
```java
  private static boolean isPlayerWin(String playerMove, String computerMove) {
  if (playerMove.equalsIgnoreCase(Move.ROCK.getValue())) {
    return computerMove.equalsIgnoreCase(Move.SCISSORS.getValue());
  } else if (playerMove.equalsIgnoreCase(Move.PAPER.getValue())) {
    return computerMove.equalsIgnoreCase(Move.ROCK.getValue());
  } else {
    return computerMove.equalsIgnoreCase(Move.PAPER.getValue());
  }
}
```

5. Disini code utama kita. Menggunakan `looping` `while()` agar permainan tetap berlanjut sampai player input `quit`.  
`Arrays.stream(Move.values()).anyMatch(move -> playerMove.equalsIgnoreCase(move.value))` ini kita menggunakan bantuan utility java yaitu `Arrays` yang fungsinya melakukan `stream` untuk cek apakah inputan player terdapat di `enum` pilihan yang kita buat.  
Jika tidak ada maka tampilkan pesan error dan minta player untuk input lagi
```java
while (true) {
  System.out.println("Choose a move :");
  String playerMove = scanner.next();

  // Akhiri permainan ketika player input "quit"
  if (playerMove.equalsIgnoreCase("quit")) {
    System.out.println("You won " + totalPlayerWin + " times and lost " + totalPlayerLosses + " times.");
    System.out.println("Thanks for playing! See you again.");
  break;
  }

  // Cek jika inputan player tidak valid
  boolean isMoveValid = Arrays.stream(Move.values()).anyMatch(move -> playerMove.equalsIgnoreCase(move.getValue()));
  if (!isMoveValid) {
    System.out.println("Move is invalid!");
    continue;
  }

  String computerMove = getComputerMove(random);

  if (playerMove.equalsIgnoreCase(computerMove)) {
    System.out.println("It's a draw!");
  } else if (isPlayerWin(playerMove, computerMove)) {
    System.out.println("Player wins!");
    totalPlayerWin++;
  } else {
    System.out.println("Computer wins!");
    totalPlayerLosses++;
  }
}
```

6. Jangan lupa di akhir code karena kita menggunakan `Scanner` jadi perlu di `close()`
```java
scanner.close();
```

## Kesimpulan
Game ini cukup sederhana, bisa dimainkan lewat terminal. Player juga bisa bermain berkali kali sampai dia input `quit`.