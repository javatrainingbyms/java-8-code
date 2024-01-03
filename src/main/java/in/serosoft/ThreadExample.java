package in.serosoft;

public class ThreadExample {
	public static void main(String[] args) {
		
		//task-1
		for(int i=1;i<=10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name+" : 2 x "+i+"  =  "+(2*i));
		}
		//task-2
		for(int i=1;i<=10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name+" : 3 x "+i+"  =  "+(3*i));
		}
		//task-3
		for(int i=1;i<=10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name+" : 4 x "+i+"  =  "+(4*i));
		}
	}
}
