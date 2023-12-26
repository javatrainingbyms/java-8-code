package in.serosoft;

public interface Trial {
	default void display() {
		System.out.println("its default display from Trial...");
	}
}
