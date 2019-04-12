public class Percussion extends Instrument {

	public String loudness;

	public Percussion (String name, double price, String owner, String loudness) {
		super(name, price, owner);
		this.loudness = loudness;
	}

	public void showInstrument() {
		super.showInstrument();
		System.out.println("Loudness: "+ loudness);
	}
}
