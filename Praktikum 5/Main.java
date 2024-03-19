import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // String yang ingin diperiksa
        String str = "abc123";

        // Regular expression untuk mencocokkan kombinasi dari angka dan karakter
        String regex = "^[a-zA-Z0-9]*$";

        // Buat pattern dari regex
        Pattern pattern = Pattern.compile(regex);

        // Buat matcher untuk mencocokkan string dengan pattern
        Matcher matcher = pattern.matcher(str);

        // Periksa apakah string cocok dengan pola regex
        if (matcher.matches()) {
            System.out.println("String merupakan gabungan angka dan karakter.");
        } else {
            System.out.println("String tidak merupakan gabungan angka dan karakter.");
        }
    }
}