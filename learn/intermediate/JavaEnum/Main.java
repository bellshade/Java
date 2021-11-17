class Main {
    // pada line 3 definisikan enum seperti mendefinisikan class
    // dan pada line 4 definisikan kata kunci dengan pemisah koma
    enum Quality {
        SD, HD, FHD, QHD, UHD
    }

    // contoh lain enum berikut
    // terdapat getter yang dapat berfungsi menampilkan deskripsi dari nilai enum
    enum Currency {
        IDR("Indonesia Rupiah"),
        SGD("Singapore Dollar"),
        KRW("Korean Won");

        String currencyDescription;

        // mendefinisikan constructor Currency dengan atribut currencyDescription
        Currency(String currencyDescription) {
            this.currencyDescription = currencyDescription;
        }
        // mendefinisikan method getCurrencyDescription dengan balikan berupa String
        String getCurrencyDescription() {
            return this.currencyDescription ;
        }
    }

    public static void main(String[] args) {
        // menampilkan enum Quality FHD
        System.out.println(Quality.FHD);
        // menampilkan enum Currency IDR
        System.out.println(Currency.IDR);
        // menampilkan enum Currency KRW berupa String currencyDescription yaitu Korean Won
        System.out.println(Currency.KRW. getCurrencyDescription());
    }
}
