package in.serosoft;

import java.util.List;

public class PrintingApp {
	public static void printMessage(LaserPrinter lp) {
		lp.print();
	}
	public static void printMessage(DigitalPrinter dp) {
		dp.display();
	}
	public static void main(String[] args) {
		//printMessage(()->{});

		
	}

}
