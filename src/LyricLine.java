
    public class LyricLine {

        // Member variables
        public String lineText;
        public long timeToDisplayMilli;


        public LyricLine(){
            System.out.println("Inside no-arg constructor");
            // Initialize member variables
            lineText = "[no lyric]";

            timeToDisplayMilli = 1000;

        } // close constructor


        public LyricLine(String lt, long ms){

            lineText = lt;
            timeToDisplayMilli = ms;


        } //close constructor ( two arg )


    } // close class


