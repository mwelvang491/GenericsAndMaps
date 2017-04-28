/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

/**
 *
 * @author mitchell
 */
public class Startup {
    public static void main(String[] args) {
       //lab2 
       Movie movie1 = new Movie("The Man Who Knew To Much", "Alfred Hitchcock", "X4-32-12");
       Movie movie2 = new Movie("Jurrasic park", "Steven Spielberg", "Y7-18-12");
       Movie movie3 = new Movie("Rogue One: A Star Wars Story", "Gareth Edwards", "A8-34-8922");
       Movie movie4 = new Movie("The Man Who Knew To Much", "Alfred Hitchcock", "X4-32-12");
       Movie movie5 = new Movie("The Man Who Knew To Much", "Alfred Hitchcock", "A2-12");
       
       Map<String, Movie> movieMap = new HashMap<String, Movie>();
      
       movieMap.put(movie1.getMovieEIDR(), movie1);
       movieMap.put(movie2.getMovieEIDR(), movie2);
       movieMap.put(movie3.getMovieEIDR(), movie3);
       movieMap.put(movie4.getMovieEIDR(), movie4);
       movieMap.put(movie5.getMovieEIDR(), movie5);
       
    //    System.out.println("Get A Specific Movie: " + movieMap.get( movie3.getMovieEIDR() ));
       
        Set<String> keys = movieMap.keySet();
       
        System.out.println("Lab 2:");
        for(String key : keys) {
            Movie movie = movieMap.get(key);
            System.out.println(movie.toString());
        }
        
        
        //Lab 3
        Map<String, Movie> movieTreeMap = new TreeMap<String,Movie>(movieMap);
        Set<String> treeMapKeys = movieMap.keySet();
        
         System.out.println("\n\nLab 3:");
        for(String key : treeMapKeys) {
            Movie movie = movieMap.get(key);
            System.out.println(movie.toString());
        }
     
        
        Collection<Movie> values = movieTreeMap.values();
        // Now put in List because Collections.sort reuquires it...
        List<Movie> sortedMovieList = new ArrayList<Movie>(values);
        
        Collections.sort(sortedMovieList);
        
        for(Movie movie : sortedMovieList) {
            System.out.println(movie);
        }
        
        
        
       
    }
   
}
