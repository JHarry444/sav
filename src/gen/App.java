package gen;

public class App {

	public static void main(String[] args) {
		Animal a = new Animal();

		Cage<Animal> c = new Cage<>();
		Cage2 c2 = new Cage2();

		c.setContents(a);
		c2.setContents(a);

		Animal a2 = c.getContents();
		Animal a3 = (Animal) c2.getContents();
	}

}
