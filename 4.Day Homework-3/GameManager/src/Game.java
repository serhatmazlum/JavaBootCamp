

public class Game {
	
	private int id;
	private String gameName;
	private double price;
	
	
	public Game(int id, String gameName, double price) {
		
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}
	public int getId() {
		return  id = (int) Math.floor(Math.random() );
	}

	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}