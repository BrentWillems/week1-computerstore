package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {

	private Processor processor;
	private ComputerCase computerCase;
	private Peripheral[] peripherals = new Peripheral[3];
	public static int MAX_PERIPHERAL = 3;

	public ComputerSystem() {
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
		Boolean found = false;
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] == null && !found) {
				peripherals[i] = peripheral;
				found = true;
			}
		}
		if (!found) {// throw exception
			throw new TooManyPeripheralsException();
		}
	}

	public void removePeripheral(String articleNumber) {
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] != null) {
				if (peripherals[i].getArticleNumber().equals(articleNumber)) {
					peripherals[i] = null;
				}
			}

		}
	}

	public int getNumberOfPeripherals() {
		int aantal = 0;
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] != null) {
				aantal++;
			}
		}
		return aantal;
	}

	public Peripheral[] getPeripherals() {
		return peripherals;
	}

	@Override
	public double totalPriceExcl() {
		// TODO Auto-generated method stub
		double price = 0;
		for (Peripheral peripheral : peripherals) {
			if (peripheral != null) {
				price += peripheral.getPrice();
			}
		}
		price += processor.getPrice();
		price += computerCase.getPrice();
		return price;
	}

	@Override
	public String toString() {
		String string = "Computercase:\n " + computerCase.toString() + "\nProcessor:\n" + processor.toString();
		for (int i = 0; i < MAX_PERIPHERAL; i++) {
			if (peripherals[i] != null) {
				string += "\nRandapparaat" + i + 1 + ":\n";
				string += peripherals[i].toString() + "\n";
			}
		}
		string += "TOTAAL EXCL.: " + totalPriceExcl() + "\nTOTAALINCL.: " + totalPriceIncl();

		return string;
	}

}
