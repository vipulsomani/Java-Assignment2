import java.util.ArrayList;

public class Movie_Detail_List {
	ArrayList<Movie_Details> movieDetails = new ArrayList<Movie_Details>();
	//Add Movie Method
	public ArrayList<Movie_Details> add_movie(Movie_Details md) {

		movieDetails.add(md);
		return movieDetails;
	}
	//Remove Movie Method
	public ArrayList<Movie_Details> remove_movie(Movie_Details md) {
		movieDetails.remove(md);
		return movieDetails;
	}
	//Remove all Mocie Method
	public ArrayList<Movie_Details> remove_AllMovies() {
		movieDetails.clear();
		return movieDetails;
	}
	//Find movie by name
	public boolean find_movie_By_mov_Name(ArrayList<Movie_Details> movieDetails, String movie) {
		for (Movie_Details md : movieDetails) {
			if (md.getMov_Name() != null && md.getMov_Name().contains(movie))
				;
			return true;
		}
		return false;
	}
	//Find Movie by Genere
	public boolean find_movie_By_Genre(ArrayList<Movie_Details> movieDetails, String genre) {
		for (Movie_Details md : movieDetails) {
			if (md.getGenre() != null && md.getGenre().contains(genre))
				;
			return true;
		}
		return false;
	}

}
