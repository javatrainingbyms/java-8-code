package in.serosoft;

@FunctionalInterface
public interface Demo {
	void show();
	String toString();
	default void display() {
		System.out.println("its default display from Demo...");
	}
	static void trial() {
		System.out.println("its static trial....");
	}
}
