package pattern;

public class Singleton {

	private Singleton() {
		super();
	}

	public static final Singleton INSTANCE = new Singleton();
}
