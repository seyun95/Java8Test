
public class Java8Test {
	
	@Test
	public void convert_list_to_map_with_java8_lambda () {
	    
	    List<Movie> movies = new ArrayList<Movie>();
	    movies.add(new Movie(1, "The Shawshank Redemption"));
	    movies.add(new Movie(2, "The Godfather"));

	    Map<Integer, Movie> mappedMovies = movies.stream().collect(
	            Collectors.toMap(Movie::getRank, (p) -> p));

	    logger.info(mappedMovies);

	    assertTrue(mappedMovies.size() == 2);
	    assertEquals("The Shawshank Redemption", mappedMovies.get(1).getDescription());
	}
	
}
