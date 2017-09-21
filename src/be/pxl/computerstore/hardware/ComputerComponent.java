package be.pxl.computerstore.hardware;

import java.util.Random;

public class ComputerComponent {
	private String vendor;
	private String name;
	private double price;

	private String  articleNumber="";
	private static int uniqueNumber;
	
	private Random rand1 = new Random();
	

	
	public ComputerComponent(String vendor2, String name2, double price2) {
		setVendor(vendor2);
		setName(name2);
		setPrice(price2);
		generateArticleNumber();
	}

	public String getShortDescription() {
			return getArticleNumber() +" * " + getName() + " * " + getPrice() + "€";
	}
	
	private void generateArticleNumber() {
		uniqueNumber++;
		if (vendor.length() >=3) {
			articleNumber = vendor.substring(0, 3).toUpperCase();
		}else {
			int aantalX = 3-vendor.length();
			articleNumber = vendor.substring(0,vendor.length()).toUpperCase();
			for(int i = 0 ;i<aantalX;i++) {articleNumber+= "X";};
		}
		articleNumber+= "-";
		int temp = Integer.toString(uniqueNumber).length();
		int aantalNullen = 5 - temp;
		String uniekNummerMetNullen = "";
		for(int i = 0; i < aantalNullen;i++) {uniekNummerMetNullen += "0";}
		uniekNummerMetNullen += Integer.toString(uniqueNumber);
		articleNumber+=uniekNummerMetNullen+"-";
		int eersteGetal = rand1.nextInt(8)+1;
		int tweedeGetal = new Random().nextInt(8)+1;
		int derdeGetal =  new Random().nextInt(8)+1;
		articleNumber += Integer.toString(eersteGetal)+Integer.toString(tweedeGetal)+ Integer.toString(derdeGetal);
		
	}
	


	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getArticleNumber() {
		return articleNumber;
	}
	
}
