# Java Enum

Enum merupakan kelas spesial yang dapat merepresentasikan sekumpulan konstanta atau variabel yang nilainya tetap, seperti variabel dengan modifier ```final```  

## Membuat Enum
Untuk membuat enum, dapat menggunakan kata kunci ```enum```, dan memisahkan setiap nilai menggunakan koma ```,```  
Penulisan untuk enum sendiri umumnya menggunakan huruf kapital semua  

contoh kode
```java
class Main {
    enum Quality {
        SD, HD, FHD, QHD, UHD
    }

    enum Currency {
        IDR("Indonesia Rupiah"),
        SGD("Singapore Dollar"),
        KRW("Korean Won");

        String currency;
        Currency(String currency) {
            this.currency = currency;
        }
        String getCurrency() {
            return this.currency;
        }
    }

    public static void main(String[] args) {
        System.out.println(Quality.FHD);
        System.out.println(Currency.IDR);
        System.out.println(Currency.KRW.getCurrency());
    }
}
```