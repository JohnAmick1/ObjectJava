
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SongMain {


        public static void main(String[] args) {
            buildLyricLineArray();
        }

        public static void buildLyricLineArray(){
            Scanner userInput = new Scanner(System.in);

            LyricLine[] Verse1 = new LyricLine[14];
            Verse1[0] =  new LyricLine("That's the way everyday goes ", 3000);
            Verse1[1] =  new LyricLine("Everytime we have no control", 3000);
            Verse1[2] =  new LyricLine("If the sky is pink and white", 3000);
            Verse1[3] =  new LyricLine("If the ground is black and yellow", 3000);
            Verse1[4] =  new LyricLine("It's the same way you showed me", 3000);
            Verse1[5] =  new LyricLine("Nod my head, don't close my eyes", 3000);
            Verse1[6] =  new LyricLine("Halfway on a slow move", 3000);
            Verse1[7] =  new LyricLine("It's the same way you showed me", 3000);
            Verse1[8] =  new LyricLine("If you could fly then you'd feel south", 3000);
            Verse1[9] =  new LyricLine("Up north's getting cold soon", 3000);
            Verse1[10] =  new LyricLine("The way it is, we're on land", 3000);
            Verse1[11] =  new LyricLine("So I'm someone to hold true", 3000);
            Verse1[12] =  new LyricLine("Keep your cool when it's still alive", 3000);
            Verse1[13] =  new LyricLine("Won't let you down when its all ruin\n", 3000);


            LyricLine[] Chorus = new LyricLine[5];
            Chorus[0] = new LyricLine("Just the same way you showed me, showed me", 3000);
            Chorus[1] = new LyricLine("You showed me love", 3000);
            Chorus[2] = new LyricLine("Glory from above", 3000);
            Chorus[3] = new LyricLine("Regard my dear", 3000);
            Chorus[4] = new LyricLine("It's all downhill from here\n", 4000);

            LyricLine[] Verse2 = new LyricLine[14];
            Verse2[0] = new LyricLine("In the wake of a hurricane", 3000);
            Verse2[1] = new LyricLine("Dark skin of a summer shade", 3000);
            Verse2[2] = new LyricLine("Nose dive in the flood lines", 3000);
            Verse2[3] = new LyricLine("Tall tower of milk crates", 3000);
            Verse2[4] = new LyricLine("It's the same way you showed me", 3000);
            Verse2[5] = new LyricLine("Cannonball off the porch side", 3000);
            Verse2[6] = new LyricLine("Older kids trying off the roof", 3000);
            Verse2[7] = new LyricLine("Just the same way you showed me (you showed)", 3000);
            Verse2[8] = new LyricLine("If you could die and come back to life", 3000);
            Verse2[9] = new LyricLine("Up for air from the swimming pool", 3000);
            Verse2[10] = new LyricLine("You'd kneel down to the dry land", 3000);
            Verse2[11] = new LyricLine("Kiss the Earth that birthed you", 3000);
            Verse2[12] = new LyricLine("Gave you tools just to stay alive", 3000);
            Verse2[13] = new LyricLine("And make it out when the sun is ruined\n", 3000);

            LyricLine[] Outro = new LyricLine[12];
            Outro[0] = new LyricLine("Remember life", 4000);
            Outro[1] = new LyricLine("Remember how it was", 4000);
            Outro[2] = new LyricLine("Climb trees, Michael Jackson, it all ends here", 4000);
            Outro[3] = new LyricLine("Say what up to Matthew, to Shoob", 4000);
            Outro[4] = new LyricLine("Say what up to Danny", 4000);
            Outro[5] = new LyricLine("Say what up to life immortality", 4000);
            Outro[6] = new LyricLine("Bending up my Nikes", 4000);
            Outro[7] = new LyricLine("Running out of melpomene, nicotine", 4000);
            Outro[8] = new LyricLine("Stealing granny cigs (take it easy)", 4000);
            Outro[9] = new LyricLine("Gimme something sweet", 4000);
            Outro[10] = new LyricLine("Bitch I make like immortality", 4000);
            Outro[11] = new LyricLine("This is life, life immortality", 4000);

            System.out.println("Pink + White - Frank Ocean \n");
            System.out.println("Enter the number of the option you would like to take below \n");
            System.out.println("1 - Sing along (Karaoke)\n2 - End Program\n3. Edit the lyrics ");

            int menuSelection = userInput.nextInt();

            switch (menuSelection){
                case 1:
                    System.out.println("You have selected to display lyrics\nSing along! ");
                    System.out.println("Verse 1:\n");
                    simKaraoke(Verse1);

                    System.out.println("Hook:\n");
                    simKaraoke(Chorus);

                    System.out.println("Verse 2:\n");
                    simKaraoke(Verse2);

                    System.out.println("Hook:\n");
                    simKaraoke(Chorus);

                    System.out.println("Outro:\n");
                    simKaraoke(Outro);

                    break;




                case 2:
                    System.out.println("Program Ended ");
                    System.exit(0);

            }

        }

        public static void simKaraoke(LyricLine[] kTape){
            Scanner scan = new Scanner(System.in);

            for(int line = 0; line < kTape.length; line++){

                LyricLine tempLine = kTape[line];

                System.out.println(tempLine.lineText);
                try {
                    Thread.sleep(tempLine.timeToDisplayMilli);
                }catch (InterruptedException ex) {

                }
            } //close loop
        } // close Karaoke
    }//close class



