import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Test_Movie_Details {
	ArrayList<Movie_Details> movieDetails = new ArrayList<Movie_Details>();
	Movie_Detail_List movie = new Movie_Detail_List();
	Movie_Details movie1 = new Movie_Details("Tanhaji", "Ajay", "Kajol", "Action");
	Movie_Details movie2 = new Movie_Details("83", "Ranveer", "Deepika", "Drama");
	Movie_Details movie3 = new Movie_Details("Rockstar", "Ranbir", "Nargis", "Class");

	@Test
	public void testInsert() {

		assertEquals(1, movie.add_movie(movie2).size());
		assertEquals(2, movie.add_movie(movie1).size());
		assertEquals(1, movie.remove_movie(movie2).size());
	    assertEquals(0, movie.remove_AllMovies().size());
	    assertEquals(1, movie.add_movie(movie1).size());
	    assertEquals(2, movie.add_movie(movie2).size());
	    assertEquals(3, movie.add_movie(movie3).size());
	    movieDetails.add(movie1);
	    assertEquals("Is movie present",true, movie.find_movie_By_mov_Name(movieDetails,"Rockstar"));
	}
}
