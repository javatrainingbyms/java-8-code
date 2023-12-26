package in.serosoft;

public class Test implements Demo, Trial {

	@Override
	public void show() {
		System.out.println("its overridden show...");
	}
	
	public void display() {
		System.out.println("its overriden default display...");
		//Demo.super.display();
		//Trial.super.display();
	}

	public void check() {
		Trial.super.display();
	}
	public static void main(String[] args) {
		Demo.trial();
		Test t=new Test();
		t.display();
		t.show();
		t.check();

	}
}
