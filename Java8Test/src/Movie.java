
public class Movie {
	private String rank;
	private String description;
	
	public Movie(String rank, String description) {
		this.rank = rank;
		this.description = description;
	}
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
