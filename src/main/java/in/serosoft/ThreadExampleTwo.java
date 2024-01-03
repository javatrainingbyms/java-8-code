package in.serosoft;

public class ThreadExampleTwo {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1=TablePrinter::printTableTwo;
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(TablePrinter::printTableThree);
		t2.start();
		
		Thread t3=new Thread(TablePrinter::printTableFour);
		t3.start();
		/*
		Thread t1=new Thread(()->{
			for(int i=1;i<=10;i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name+" : 2 x "+i+"  =  "+(2*i));
			}
		});
		Thread t2=new Thread(()->{
			for(int i=1;i<=10;i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name+" : 3 x "+i+"  =  "+(3*i));
			}
		});
		Thread t3=new Thread(()->{
			for(int i=1;i<=10;i++) {
				String name=Thread.currentThread().getName();
				System.out.println(name+" : 4 x "+i+"  =  "+(4*i));
			}
		});
		t1.start();
		t2.start();
		t2.join(); //join blocks the running thread, till the invoking thread goes to dead state
		//here the control will come once t2 goes to dead
		t3.start();
		*/
		/*
		Runnable runnable1=new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					String name=Thread.currentThread().getName();
					System.out.println(name+" : 2 x "+i+"  =  "+(2*i));
				}
			}
		};
		Thread t1=new Thread(runnable1);
		t1.setName("FirstThread ");
		t1.start();
		*/
	}
}
