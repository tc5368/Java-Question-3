public class Triangle extends Percussion {

	private String note;

	public Triangle (String name, double price, String owner, String note, String loudness) {
		super(name, price, owner, loudness);
		this.note = note;
	}

	public void showInstrument() {
		System.out.println("Triangle Details: ");
		super.showInstrument();
		System.out.println("Triangle note: " + note);
	}
}