package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {

	private double clockspeed;
	private double minimumClockspeed = 0.7;

	public Processor(String vendor, String name, double price, double clockspeed) {
		super(vendor, name, price);
		setClockspeed(clockspeed);
	}

	@Override
	public String toString() {
		return "ArticleNumber = " + getArticleNumber() + "\n" + "Vendor = " + getVendor() + "\n" + "Name = " + getName()
				+ "\n" + "Price = " + getPrice() + "\n" + "Clock speed = " + getClockspeed() + "GHz";

	}

	public double getClockspeed() {
		return clockspeed;
	}

	public void setClockspeed(double clockspeed) {
		if (clockspeed >= minimumClockspeed) {
			this.clockspeed = clockspeed;
		} else {
			this.clockspeed = minimumClockspeed;
		}

	}

}
