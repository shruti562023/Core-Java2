package string;

public class OccuranceAllChar {
    public static void main(String[] args) {

        String str = "shrutiii";
        String fr = "";  // will store already counted chars

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // skip if already printed
            if (fr.indexOf(ch) != -1) { 
                continue; 
            }

            int count = 0;

            // count occurrences
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
  
        
            fr = fr + ch;

            System.out.println(ch + " = " + count);
        }
    }
}
