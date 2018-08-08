
/**
 * This is a child of Entertainment and will recieve its values
 *
 * @author Tyson Sigette
 * @version (a version number or a date)
 */
public class Song extends Entertainment
{
    private String genre;
    private String artist;
    
    /**
     * Create constructors. Always create a default no value constructor first.
     * You should always have a constructor that passes all variables through.
     */
    public Song()
    {
        this("", "", "", 0);
    }
    
    public Song(String title){
        this(title, "", "", 0);
    }
    
    public Song(String title, String artist, String genre, int runTime) {
        super(title, runTime);
        this.artist=artist;
        this.genre=genre;
    }
    
    /**
     * getters and setters (no point in putting the static in-- teach this lesson
     * as it is a very common error we will see-- remove the static
     */

    public void setArtist(String a){
        artist=a;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public void setGenre(String g){
        genre=g;
    }

    public String getGenre(){
        return genre;    
    }

    
    /**
     * Methods for my Song class
     */
   public void convertToProperTime(){
        int minutes=getRunTime()/60; //assign minutes to just the whole number and lose the decimal.
        int seconds=getRunTime()%60;  //assign seconds to the remainder you get from the division.
        String time = "";
        if(minutes==1){
            time = time + minutes + " minute "; 
        }
        else if(minutes>1){
            time = time + "1 minute ";
        }
        
        //now checking seconds for proper English
        if (seconds==1){
            time = time + "1 second.";
        }
        else if (seconds>1){
            time = time + seconds + " seconds";
        }
        System.out.println(time + "");
}
}