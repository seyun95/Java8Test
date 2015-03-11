
public class Movie {
	private int rank;
	private String description;
	
	public Movie(int rank, String description) {
		this.rank = rank;
		this.description = description;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
