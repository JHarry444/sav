package exc;

import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		throw new NullPointerException();
		throw new IOException();
		throw new ThreadDeath();
	}

}
