
/**
 * Parent class for movie and song
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Entertainment
{
    private String title;
    private int runTime;
    
    public Entertainment()
    {
       this("", 0);
    }
    
    public Entertainment(String t, int rt) {
        title = t;
        runTime = rt;
    }
    
    /**
     * getters and setters (no point in putting the static in-- teach this lesson
     * as it is a very common error we will see-- remove the static (dont use public static void setName)
     */
    public void setTitle(String n){
        title=n;
    }

    public String getTitle(){
        return title;
    }

        public void setRunTime(int rt){
        runTime=rt;
    }

    public int getRunTime(){
        return runTime;
    }

}
