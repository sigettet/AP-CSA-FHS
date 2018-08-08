
/**
 * This is a child of Entertainment and will recieve its values.
 *
 * @author Tyson Sigette
 * @version (a version number or a date)
 */
public class Movie extends Entertainment
{
        private String genre;
        private String director;
    
    /**
     * Create constructors. Always create a default no value constructor first.
     * You should always have a constructor that passes all variables through.
     */
    public Movie()
    {
        this("", "", "", 0);   
    }

    public Movie(String title){
        this(title, "", "", 0);
    }

    public Movie(String title, String director, String genre, int runTime) {
        super(title, runTime);
        this.director=director;
        this.genre=genre;
    }

    /**
     * getters and setters (no point in putting the static in-- teach this lesson
     * as it is a very common error we will see-- remove the static (dont use public static void setName)
     */
    

    public void setDirector(String d){
        director=d;
    }

    public String getDirector(){
        return director;
    }

       public void setGenre(String g){
        genre=g;
    }

    public String getGenre(){
        return genre;    
    }

    /**
     * Methods for my Movie class
     * Set the runtime for my movie
     */
    public void convertToProperTime(){
        int hours=getRunTime()/60; //assign hours to just the whole number and lose the decimal.
        int minutes=getRunTime()%60;  //assign minutes to the remainder you get from the division.
        String time = "";
        if(hours==1){
            time = time + hours + " hour "; 
        }
        else if(hours>1){
            time = time + "1 hour ";
        }
        
        //now checking minutes for proper English
        if (minutes==1){
            time = time + "1 minute.";
        }
        else if (minutes>1){
            time = time + minutes + " minutes";
        }
        System.out.println(time + "");
}
}