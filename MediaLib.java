import java.util.ArrayList;

/**
 * Write a description of class MediaLib here.
 *
 * @author (Tyson Sigette)
 * @version (Aug. 6, 2018)
 */
public class MediaLib
{
public static void main() {
    Movie m1 = new Movie("TITLE", "DIRECTOR", "GENRE", 123);
    m1.convertToProperTime();
    Song s1 = new Song("SONG TITLE", "ARTIST", "SONG GENRE", 321);
    s1.convertToProperTime();
}  

public static void main2() {
    //Song[] songArray;
    
    Song song1=new Song();
    song1.setTitle("YMCA");  
    Song song3=new Song("Radioactive");
    Song song4=new Song("Puff the Magic Dragon");
    
    
    Song[] songArray={song1, song3, song4};
    
    
    System.out.println("My Songs");
    System.out.println("Using the STANDARD FOR LOOP");
    System.out.println("");
    //First way of printing before the foor loop is used- this just prints out one song
    //printing out the first song in my song array
    //System.out.println(songArray[0].getTitle());
    
    //for loops 3 components (counter; where to stop looping; step size)-- This is a standard FOR LOOP
    for(int x=0;x<songArray.length;x++)
    {
        System.out.println(songArray[x].getTitle());
    }
    
    System.out.println("------------");
    System.out.println("Using the ENHANCED FOR LOOP");
    System.out.println("");
    
    //"For song x in song array" is the proper pronunciation
    for(Song songX:songArray){
        System.out.println(songX.getTitle());
    }
    
    
    ArrayList<Movie> movie=new ArrayList<>();
    movie.add(new Movie("Star Wars"));
    movie.add(new Movie("My Left Shoe"));
    movie.add(new Movie("Pretty Woman"));
    movie.add(new Movie("The Bridge to Terebithia"));
    movie.add(0, new Movie("Predator"));
    
    Movie mov1=movie.get(0); //MovieA[0]
    
    movie.set(0, new Movie("Fargo"));
    
    
    System.out.println("------------");
    System.out.println("This is the number of movies in my library:");
    System.out.println(movie.size());
    System.out.println("");
    System.out.println("This third movie in my library is " + movie.get(2).getTitle());
    System.out.println("");
    System.out.println("Here is a list of all the movies I own ");
    for(Movie movieX:movie){
     System.out.println(movieX.getTitle());   
    }
    
    
    //to remove a movie fromthe ArrayList you can use the index or the string 
    //name of the movie (only removes first match)
    //movie.remove(0);
    
    
    //System.out.println(song1.getTitle());
    //song1.convertToProperTime();
    //System.out.println("");
    
    //System.out.println(song2.getTitle());
    //song2.convertToProperTime();
    //System.out.println("");
    
    //Movie movie1=new Movie();
    //movie1.setName("Repo Man");
    //movie1.setRunTime(107);
    //movie1.setGenre("Sci Fi");
    //movie1.setDirector("Alex Cox");
    
    //Movie movie2=new Movie("Lord of the Rings", "Peter Jackson", 45);
    
   
    //System.out.println(movie1.getName());
    //System.out.println(movie1.getDirector());
    //System.out.println(movie1.getGenre());
    //movie1.convertToProperTime();
    //System.out.println("");
    
    //System.out.println(movie2.getName());
    //System.out.println(movie2.getDirector());
    //System.out.println(movie2.getGenre());
    //movie2.convertToProperTime();  
    //System.out.println("");
    
    
    
    }
}
