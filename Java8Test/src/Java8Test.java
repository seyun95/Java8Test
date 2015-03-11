import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start java8 test program...");
		
		convert_list_to_map_with_java8_lambda();
		
		/*
		List<String> myLists = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			myLists.add("Test" + i);
		}
		
		// using classic..
		long startTime = System.currentTimeMillis();
		for(String element : myLists) {
			System.out.println("Test for :" + element);
		}
		long classicTime = System.currentTimeMillis() - startTime;
		
		// using lambda
		startTime = System.currentTimeMillis();
		myLists.stream().forEach(str -> {
			System.out.println("Test for -> " + str);
		});
		long lambdaTime = System.currentTimeMillis() - startTime;
		
		System.out.println("Classic Time : " + classicTime + " ms, Lambda Time : " + lambdaTime + " ms");
		*/
	}

	public static void convert_list_to_map_with_java8_lambda () {
	    
	    List<Movie> movies = new ArrayList<Movie>();
	    movies.add(new Movie("1", "The Shawshank Redemption"));
	    movies.add(new Movie("2", "The Godfather"));

//	    Map<Integer, Movie> mappedMovies = movies.stream().collect(
//	            Collectors.toMap(Movie::getRank, (p) -> p));
	    Map<String, String> mappedMovies = movies.stream().collect(
	    		Collectors.toMap(Movie::getRank, Movie::getDescription));
	    		
	   System.out.println("first : " + mappedMovies.get("1"));
	   System.out.println("second : " + mappedMovies.get("2"));
   
//	   System.out.println("first : " + mappedMovies.get(1).getDescription());
//	   System.out.println("second : " + mappedMovies.get(2).getDescription());
	}
}
