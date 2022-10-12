package utilities.JavaBase64Decoder;
import java.util.Base64;

public class JavaBase64Decoder {
    public static void main(String[] args) {
        
        // String untuk didecode
        String encodedText = "SGVsbG8sIEJlbGxzaGFkZSAh";

        // Decoding
        byte[] plainBytes = Base64.getDecoder().decode(encodedText);

        // Deklarasi bytes hasil decode kedalam bentuk String

        String plainString = new String(plainBytes);

        // Tampilkan hasil decoding
        System.out.println(plainString);
    }
}
