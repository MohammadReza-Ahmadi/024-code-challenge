package _0_024_exercises.hackerrank;


//todo: name: BookingQ1Test
public class BookingQ1 {

    public static char maximumOccurringCharacter(String text) {
        int[] charCounts = new int[75];

        //create an array of  chars codes
        for (int i = 0; i < text.length(); i++)
            charCounts['z' - text.charAt(i)]++;


        int maxOccur = -1;
        char maxChar = ' ';
        for (int i = 0; i < text.length(); i++) {
            int charCount = charCounts['z' - text.charAt(i)];
            if (maxOccur < charCount) {
                maxOccur = charCount;
                maxChar = text.charAt(i);
            }
        }

        return maxChar;
    }

}
