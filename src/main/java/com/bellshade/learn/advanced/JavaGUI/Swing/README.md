# SWING
Pada materi ini berisikan tentang apa-apa saja yang ada di Swing Java ini. Ngomgong-ngomong sebelum terjun ke programnya secara langsung, apa sih **Java Swing** ini?? 

Swing adalah sebuah GUI Toolkit dalam Java. Toolkit ini adalah bentuk _standard_ dari Java sehingga tidak perlu melakukan penambahan library lagi kalau ingin menggunakan GUI Toolkit ini. Dibandingkan dengan Toolkit lain, Swing mempunyai lebih banyak komponen pendukung untuk membangun sebuah aplikasi yang lengkap untuk keperluan desktop. Swing ini 100 % ditulis dengan bahasa pemrograman Java tanpa adanya sebuah wrapper untuk memanggil rutin-rutin native code via JNI (Java Native Interface). Seluruh komponen yang terdapat pada Swing, semuanya murni digambar sendiri menggunakan API (Application Programming Interface) 2D untuk memanggil rutin-rutin dasar penggambaran komponen-nya. Dengan model seperti ini, memungkinkan sekali aplikasi yang dibangun menggunakan Swing tampak sama persis di berbagai macam Sistem Operasi.Swing juga mempunyai kemampuan untuk berganti-ganti tampilan menggunakan LAF (Look And Feel) atau themes Sayang-nya, jika kita menginginkan tampilan GUI yang native (tampilan-nya sama seperti aplikasi-aplikasi lain pada sistem operasi target) Swing seperti-nya masih terasa kurang smooth terutama dukungan pada font rendering-nya.

### Komponen-Komponen Swing
1. JPanel
JPanel adalah salah satu komponen swing pertama dan dasar dikarenakan JPanel ini lah adalah hasil GUI yang nanti akan dikeluarkan. JPanel memiliki komponen-komponen cabang antara lain JLabel, JButton, JList dan lain-lain yanng berada di bawah ini.

2. JLabel
JLabel adalah JLabel merupakan komponen yang digunakan untuk menampilkan teks yang pendek. JLabel juga digunakan untuk menampilkan icon (gambar berukuran kecil) atau menampilkan icon dan teks. JLabel merupakan sub kelas dari JFrame

3. JButton
JButton berguna untuk membuat objek tombol yg dapat dilengkapi dengan judul tombol maupun ikon.

4. JCheckbox
JCheckBox digunakan untuk memilih salah satu pilihan di antara dua kemungkinan.

5. JRadioButton
JRadioButton digunakan untuk menampilkan pilihan yang dimana terdapat ButtonGroup digunakan untuk membuat pemakai hanya bisa memilih salah satu dari sejumlah tombol radio.