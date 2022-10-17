# Java JSON

Pada _package_ ini, akan membahas mengenai penanganan JSON pada Java, berfokus pada _library_ Jackson yang sangat populer digunakan.

## Penambahan _Dependency_ pada file _pom.xml_

dimulai dengan menambahkan dependency kedalam file ```pom.xml```

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.4.2</version>
</dependency>
```
untuk detail versi yang digunakan bisa merujuk pada [_maven central repository_](https://search.maven.org/artifact/com.fasterxml.jackson.core/jackson-databind)


## Penggunaan _ObjectMapper_
penggunaan dapat dimulai dengan inisiasi obyek berikut

```java
import com.fasterxml.jackson.databind.ObjectMapper;

class Main {
    ObjectMapper objectMapper = new ObjectMapper();
}
```
lalu untuk beberapa contoh penggunaan bisa dilihat pada [JacksonObjectMapper.java](JacksonObjectMapper.java)