package gen;

public class Cage<T extends Animal> {

	private T contents;

	public T getContents() {
		return this.contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}
}
