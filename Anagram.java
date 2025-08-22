import java.util.Scanner;

public class Anagram {
  static boolean isAnagram(String a, String b) {
        //  Make both strings lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        //  Length check
        if (a.length() != b.length()) {
            return false;
        }

        //  Frequency array for 26 letters
        int[] freq = new int[26];

        //  Count characters from string a
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            freq[ch - 'a']++;
        }

        // Subtract characters from string b
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            freq[ch - 'a']--;
        }

        
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true; // Strings are anagrams
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}