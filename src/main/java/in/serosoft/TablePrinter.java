package in.serosoft;

public class TablePrinter {
	//task-1
	public static void printTableTwo() {
			for(int i=1;i<=10;i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name+" : 2 x "+i+"  =  "+(2*i));
			}
	}
			//task-2
	public static void printTableThree() {
			for(int i=1;i<=10;i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name+" : 3 x "+i+"  =  "+(3*i));
			}
	}
			//task-3
	public static void printTableFour() {
			for(int i=1;i<=10;i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name+" : 4 x "+i+"  =  "+(4*i));
			}
	}
}
