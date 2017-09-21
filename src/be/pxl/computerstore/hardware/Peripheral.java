package be.pxl.computerstore.hardware;



public abstract class Peripheral extends ComputerComponent {
	
	public Peripheral(String vendor,String name,double price) {
	super(vendor,name,price);
	}
	

	@Override
	public String getShortDescription() {
		 return getArticleNumber() +" * "+ getClass().getSimpleName()+" * " + getName() + " * " + getPrice() + "€";
	}
	
	@Override
	public String toString() {
		
		return "ArticleNumber = " + getArticleNumber() + "\nVendor = " + getVendor() + "\n" + "Name = " + getName() + "\n"
				+ "Price = " + getPrice();
	}
}
