package be.pxl.computerstore.hardware;

public class HardDisk extends ComputerComponent {

	private int gigaByte;
	
	public HardDisk(String vendor, String name, double price,int gigaByte) {
		super(vendor, name, price);
		setGigaByte(gigaByte);
	}

	public int getGigaByte() {
		return gigaByte;
	}

	public void setGigaByte(int gigaByte) {
		this.gigaByte = gigaByte;
	}

}
