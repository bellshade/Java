# SWING
Pada materi ini berisikan tentang apa-apa saja yang ada di Swing Java ini. Ngomgong-ngomong sebelum terjun ke programnya secara langsung, apa sih **Java Swing** ini?? 

Swing adalah sebuah GUI Toolkit dalam Java. Toolkit ini adalah bentuk _standard_ dari Java sehingga tidak perlu melakukan penambahan library lagi kalau ingin menggunakan GUI Toolkit ini. Dibandingkan dengan Toolkit lain, Swing mempunyai lebih banyak komponen pendukung untuk membangun sebuah aplikasi yang lengkap untuk keperluan desktop. Swing ini 100 % ditulis dengan bahasa pemrograman Java tanpa adanya sebuah wrapper untuk memanggil rutin-rutin native code via JNI (Java Native Interface). Seluruh komponen yang terdapat pada Swing, semuanya murni digambar sendiri menggunakan API (Application Programming Interface) 2D untuk memanggil rutin-rutin dasar penggambaran komponen-nya. Dengan model seperti ini, memungkinkan sekali aplikasi yang dibangun menggunakan Swing tampak sama persis di berbagai macam Sistem Operasi.Swing juga mempunyai kemampuan untuk berganti-ganti tampilan menggunakan LAF (Look And Feel) atau themes Sayang-nya, jika kita menginginkan tampilan GUI yang native (tampilan-nya sama seperti aplikasi-aplikasi lain pada sistem operasi target) Swing seperti-nya masih terasa kurang smooth terutama dukungan pada font rendering-nya.

### Komponen-Komponen Swing
1. JFrame:
JFrame adalah komponen utama dalam aplikasi Swing yang mewakili jendela aplikasi. Ini adalah tempat di mana komponen-komponen lain ditempatkan. Anda dapat mengatur tampilan jendela, judul, ukuran, dan perilaku lainnya.

2. JPanel
JPanel adalah wadah atau kontainer yang digunakan untuk mengelompokkan dan mengatur komponen-komponen lain dalam jendela JFrame. Ini sering digunakan untuk mengatur tata letak dalam antarmuka pengguna.

3. JButton:
JButton adalah tombol yang dapat diklik oleh pengguna. Ini digunakan untuk memicu tindakan tertentu ketika tombol tersebut ditekan.

4. JLabel:
JLabel adalah komponen teks non-interaktif yang digunakan untuk menampilkan teks atau gambar sebagai label atau keterangan di antarmuka pengguna.

5. JTextField:
JTextField adalah komponen input teks yang memungkinkan pengguna untuk memasukkan teks. Ini sering digunakan untuk mengumpulkan data dari pengguna.

6. JTextArea:
JTextArea adalah komponen input teks yang lebih besar dan multi-baris dibandingkan JTextField. Ini cocok untuk memasukkan teks yang panjang atau beberapa baris.

7. JComboBox:
JComboBox adalah komponen dropdown yang memungkinkan pengguna memilih satu opsi dari daftar yang disediakan. Ini sering digunakan untuk memilih dari kategori atau daftar pilihan.

8. JCheckBox:
JCheckBox adalah kotak centang yang digunakan untuk memungkinkan pengguna memilih beberapa pilihan dari sejumlah pilihan yang tersedia.

9. JRadioButton:
JRadioButton digunakan untuk menampilkan pilihan yang dimana terdapat ButtonGroup digunakan untuk membuat pemakai hanya bisa memilih salah satu dari sejumlah tombol radio.

10. JList:
JList adalah komponen untuk menampilkan daftar elemen dalam satu atau lebih kolom. Ini sering digunakan untuk menampilkan daftar item yang dapat dipilih.

11. JSplitPane:
JSplitPane adalah komponen yang memungkinkan pembagian area tampilan menjadi dua panel yang dapat diubah ukurannya. Ini sering digunakan dalam aplikasi yang memerlukan tampilan terbagi.

12. JScrollPane:
JScrollPanel adalah komponen yang digunakan untuk mengelola komponen-komponen lain, seperti JList atau JTextArea, yang mungkin memerlukan bilah geser jika kontennya terlalu besar untuk ditampilkan sepenuhnya.

13. JMenuBar:
JMenuBar adalah komponen yang berisi menu dan submenu. Ini digunakan untuk membuat menu bar di bagian atas jendela aplikasi.

14. JMenu:
JMenu adalah komponen yang berisi daftar pilihan yang muncul saat pengguna mengklik item menu di JMenuBar.

15. JMenuItem:
JMenuItem adalah item individu dalam JMenu yang mewakili tindakan yang dapat diambil oleh pengguna.

16. JDialog:
JDialog adalah jendela dialog yang muncul di atas JFrame. Ini digunakan untuk menampilkan pesan atau mengumpulkan masukan dari pengguna.
