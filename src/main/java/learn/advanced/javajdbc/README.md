## Java JDBC
### What
Java Database Connectivity, Ini adalah API (Application Programming Interface) Java yang menyediakan serangkaian kelas dan antarmuka untuk menghubungkan aplikasi Java dengan basis data dan menjalankan pernyataan SQL (Structured Query Language). JDBC memungkinkan program Java berinteraksi dengan berbagai jenis basis data relasional, seperti MySQL, Oracle, PostgreSQL, SQL Server, dan lain-lain.

### How
Untuk kesempatan ini kita menggunakan MySQL sebagain database, pertama kita perlu import driver mysql terlebih dahulu pada file pom.xml
```
 <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.32</version>
 </dependency>
```

Setelah itu buat class untuk config connection database nya, sesuaikan config database dengan env sendiri
```
public class JdbcConfig {

    /**
     * @return return connection database
     */
    public static Connection connection() {
        String url = "jdbc:mysql://localhost:3306/identity";
        String username = "root";
        String password = "test123!";

        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
```

abstract Class BaseDao merupakan contoh base class untuk interaksi dengan Database, untuk query nya tinggal disesuaikan di class yg extends class ini.

contoh class yg extends BaseDao ini adalah [PersonRepository.java](repository/PersonRepository.java)

untuk contoh penggunaan repository nya bisa di lihat di class [PersonServiceImpl.class](service/PersonServiceImpl.java)

contoh penambahan table baru , misal table nya user 
- pertama bikin class model misal User.java
    ```
    public class User {
    
       private String userName;
       private LocalDateTime createdDate;
       //getter & setter
    }
    ```
- setelah itu bikin class Repository misal UserRepository.java extend BaseDao dan sesuaikan parameter query nya
    ```
    public class UserRepository extends BaseDao<User> {
    
       //implement all method from BaseDao
    }
    ```