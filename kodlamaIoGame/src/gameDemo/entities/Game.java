package gameDemo.entities;

public class Game {
	
	private int gameId;
	private String gameName;
	private double unitPrice;
	private int stockAmount;
	private int discountAmount;
	
	public Game() {
		
	}
	
	public Game(int id, String name, double unitPrice, int stockAmount, int discountAmount) {
		super();
		this.gameId = id;
		this.gameName = name;
		this.unitPrice = unitPrice;
		this.stockAmount = stockAmount;
		this.setDiscountAmount(discountAmount);
	}

	public int getId() {
		return gameId;
	}

	public void setId(int id) {
		this.gameId = id;
	}

	public String getName() {
		return gameName;
	}

	public void setName(String name) {
		this.gameName = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
	
	
	

}
