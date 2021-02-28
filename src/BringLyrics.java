import java.util.Scanner;

public class BringLyrics {


    public class LyricGenerator {
        String[][] lyrics;
        String songTitle;
        String artist;
        int releaseYear;

        public void initializeArray(int maxLinesInVerse, int numVerses){

            if(maxLinesInVerse > 0 && numVerses > 0 ){

                lyrics = new String[maxLinesInVerse][numVerses];
                System.out.println("Array has a max line count of - " + lyrics.length);
                System.out.println("Array verse count - " + lyrics[0].length);
            } else {
                System.out.println("Incorrect size input: lines and verses must be above 0");
            }

        }

        public void readInLyrics(){

            Scanner inScan = new Scanner(System.in);

            for(int line=0;line < lyrics.length; line++){

                String userLine = inScan.nextLine();

                lyrics[line][0] = userLine;
            }

        }

        public void displayLyrics(){

            for(int row=0; row < lyrics.length; row++){

                for(int col=0; col < lyrics[row].length; col++ ){
                    System.out.println("Bin contents: " + lyrics[row][col]);
                }
                System.out.println();
            }
        }
    }
} //end class
