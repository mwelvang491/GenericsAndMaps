package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie  {
    private String title;
    private String director;
    private String movieEIDR; 
    //EIDR-Entertainment Identity Register. Movies and other entertianment media 
    //Have A Unique Id provided by the Entertainment Identity Register. 

    public Movie(String title, String director, String movieEIDR) {
        this.title = title;
        this.director = director;
        this.movieEIDR = movieEIDR;
    }
    
    

        public int compareTo(Movie movie) {
        
        //Apache Commons
        return new CompareToBuilder()
               .append(this.movieEIDR, movie.movieEIDR )
               .toComparison(); 
        }
    
    @Override
    public String toString() {
        return "Movie Title: " + title + ", Director: " + director + ", MovieEIDR: " + movieEIDR;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.director);
        hash = 53 * hash + Objects.hashCode(this.movieEIDR);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.movieEIDR, other.movieEIDR)) {
            return false;
        }
        return true;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieEIDR() {
        return movieEIDR;
    }

    public void setMovieEIDR(String movieEIDR) {
        this.movieEIDR = movieEIDR;
    }
    
    
    

}
