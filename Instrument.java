public class Instrument {

	public String name;
	public Double price;
	public String owner;

	public Instrument (String name, Double price, String owner) {
		this.name  = name;
		this.price = price;
		this.owner = owner;
	}

	protected final String getName(){
		return this.name;
	}
	protected final Double getPrice(){
		return this.price;
	}
	protected final String getOwner(){
		return this.owner;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setColour(String owner){
		this.owner = owner;
	}

	public void showInstrument() {
		System.out.println("Name: "  + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Owner: " + this.owner);
	}
}
