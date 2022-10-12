package utilities.JavaBase64Encoder;
import java.util.Base64;

public class JavaBase64Encoder {
    public static void main(String[] args) {
        
        // Kalimat untuk diencode
        String text = "Hello, Bellshade !";

        // Encode format Base64
        String Base64Text = Base64.getEncoder().encodeToString(text.getBytes());

        // Tampilkan hasil encoding
        System.out.println(Base64Text);
    }
}
