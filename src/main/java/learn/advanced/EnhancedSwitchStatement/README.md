# Enhanced Switch Statement

Jika Anda seorang programmer, kemungkinan besar Anda sudah mengetahui fitur bernama Switch Statement yang telah muncul di sebagian besar bahasa pemrograman. Menggunakan switch statement seringkali sangat panjang dan itulah sebabnya terkadang pernyataan if-else digunakan. Namun, enhanced switch statement dapat mengatasi masalah ini di versi Java terbaru.

Untuk memberi Anda pemahaman lebih, saya akan memberi Anda contoh Classic Switch di Java dan juga Enhanced Switch.

Classic Switch
```java
public String toDayStringUsingSwitch(int dayIndex) {
    String result;

    switch (dayIndex) {
        case 1:
            result = "Sunday";
            break;
        case 2:
            result = "Monday";
            break;
        case 3:
            result = "Tuesday";
            break;
        case 4:
            result = "Wednesday";
            break;
        case 5:
            result = "Thursday";
            break;
        case 6:
            result = "Friday";
            break;
        case 7:
            result = "Saturday";
            break;
        default:
            throw new IllegalArgumentException("Invalid day index");
    }

    return result;
}
```

Enhanced Switch
```java
public String toDayStringUsingSwitch(int dayIndex) {
    return switch (dayIndex) {
        case 1 -> "Sunday";
        case 2 -> "Monday";
        case 3 -> "Tuesday";
        case 4 -> "Wednesday";
        case 5 -> "Thursday";
        case 6 -> "Friday";
        case 7 -> "Saturday";
        default -> throw new IllegalArgumentException("Invalid day index");
    };
}
```

Dari contoh di atas, Anda dapat melihat bahwa baris kode berkurang secara signifikan dengan menggunakan enhanced switch statement, dan saya pribadi berpikir bahwa versi switch ini lebih mudah dibaca jika dibandingkan dengan versi klasik.