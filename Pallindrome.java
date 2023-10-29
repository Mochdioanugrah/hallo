import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Masukkan kata atau frasa: ");
        String inputString = input.nextLine();
 if (isPalindrome(inputString)) {
             out.println(inputString + " adalah palindrome.");
         } else {
             out.println(inputString + " bukan palindrome.");
         }
     }

     public static boolean isPalindrome(String text) {
             text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Hapus karakter non-alphanumeric dan ubah menjadi huruf kecil
             int length = text.length();

         for (int i = 0; i < length / 2; i++) {
             if (text.charAt(i) != text.charAt(length - i - 1)) {
                 return false;
             }
         }
         return true;
     }
}Hallo
hallo
"test" 
ajg
hallo
