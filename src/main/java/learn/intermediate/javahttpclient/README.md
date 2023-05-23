# Java HttpClient

Proyek ini menjelaskan cara menggunakan kelas Java `HttpClient` untuk mengirim permintaan HTTP dan memproses responsnya.

## Persyaratan

- Java 11 atau yang lebih baru


## Notes

- Kelas HttpClient diperkenalkan pada Java 11 sebagai pengganti kelas HttpURLConnection yang lebih lama.
- Contoh ini menjelaskan permintaan GET sederhana, tetapi Anda dapat mengubahnya untuk mendukung metode HTTP lainnya (misalnya, POST, PUT, DELETE).
- Opsi kustomisasi tambahan, seperti mengatur header permintaan atau mengelola body respons dalam format yang berbeda, dapat ditambahkan sesuai kebutuhan Anda.


## Cara Penggunaan
- penggunaan dapat dimulai dengan inisiasi obyek berikut

    ```java
    import com.fasterxml.jackson.databind.ObjectMapper;
    import java.net.http.HttpClient;
    
    class Main {
        HttpClient httpClient = HttpClient.newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
    }
    ```
- kemudian inisiasi object RestClientService dan masukan dependecies tersebut
    ```java
    import com.fasterxml.jackson.databind.ObjectMapper;
    import java.net.http.HttpClient;
    
    class Main {
        HttpClient httpClient = HttpClient.newBuilder().build();
        ObjectMapper objectMapper = new ObjectMapper();
  
        RestClientService restClientService = new RestClientServiceImpl(httpClient, objectMapper);
    }
    ```
- pada class RestClientServiceImpl ini terdapat contoh http request get, untuk membuat request tersebut kita perlu inisiasi object request terlebih dahulu
    ```
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://pokeapi.co/api/v2/berry/"+id))
                    .build();
    ```
- setelah itu tinggal execute request dengan http send
     ```
       httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    ```
- untuk request POST kita bisa ubah HttpRequest nya seperti berikut
    ```
      HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.example.com/endpoint"))
                .header("Content-Type", "application/json")
                .POST(HttpBodyPublishers.ofString("{\"name\":\"John\",\"age\":30}"))
                .build();
    ```