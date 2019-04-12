public class Drum extends Percussion {

	private Double diameter;

	public Drum (String name, double price, String owner, double diameter, String loudness) {
		super(name, price, owner, loudness);
		this.diameter = diameter;
	}

	public void showInstrument() {
		System.out.println("Drum Details: ");
		super.showInstrument();
		System.out.println("Drum loudness: " + loudness);
	}

	public void showInstrumentLong(){
		System.out.println("Drum Details: ");
		System.out.println("Name: " + name);
		System.out.println("Price" + price);
		System.out.println("Owner" + owner);
		System.out.println("Diameter" + diameter);
		System.out.println("loudness" + loudness);
	}

}
