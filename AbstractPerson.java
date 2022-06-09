package techBoost.example;

public abstract class AbstractPerson {

	abstract public String getGender();

	public void speak() {
		System.out.println("I'm a " + getGender());
	}
}


