package learn.advanced.ImageProcessing.ColoredImageGrayScale;

/*
Pada materi ini, akan membahas tentang Image Proccesing pada Java. Sebelumnya apa sih itu Image Processing?
Image Processing atau artinya Pemrosesan gambar adalah suatu bentuk pengolahan atau pemrosesan sinyal dengan input 
berupa gambar (image) dan ditransformasikan menjadi gambar lain sebagai keluarannya dengan teknik tertentu.
Pada bagian ini akan berisikan Konversi gambar berwarna ke gambar yang abu-abu

nb: Kalian bisa menggunakan gambar sendiri ya. Gambar yang ada di github sbg contoh aja
    Pastikan gambar juga sesuai folder yang akan ditaruh
    Kalian bisa mendownload source_code ini sbg contoh
*/
import java.io.*; // mengimport package Java Input-Output secara Dinamis
import java.awt.image.BufferedImage; // mengimport package Java Gambar, dari SubClass java.io
import javax.imageio.ImageIO; // mengimport package Java Input-Output Gambar, dari SubClass java.io

public class Programnya {
    public static void main(String[] args) throws IOException {
        BufferedImage image = null;
        File file = null;

        try {
            file = new File("src/F1-Lewis-Hamilton.jpg");
            image = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println(e);
        }
        int width = image.getWidth();
        int height = image.getHeight();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int p = image.getRGB(x,y);
                int a = (p>>24) & 0xff;
                int r = (p>>16) & 0xff;
                int g = (p>>8) & 0xff;
                int b = p & 0xff;
                int avg = (r+g+b)/3;
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                image.setRGB(x, y, p);
            }
        }
        try {
            file = new File("src/greyscale.jpg");
            ImageIO.write(image, "jpg", file);
            System.out.println("Sukses Menkonversi Gambar ke Warna Abu-Abu dari gambar Cerah sebelumnya");
            System.out.println("Credit: Carl Jorgensen dari Unsplash.com");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

/*
Pada hasil Output nantinya, akan ada gambar keluar langsung beserta pesan output source_code
pada blok Try-Catch bagian bawah. Gambar akan langsung keluar dimana kalian ingin gambar tersebut keluar.
Karena ini github, maka saya akan menaruh gambar dan Hasil Gambar di folder "src".

Credit Gambar : Carl Jorgensen dari unsplash.com (https://unsplash.com/photos/Bx-dKrVq-oM)
*/
