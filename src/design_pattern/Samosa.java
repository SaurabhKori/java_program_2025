package design_pattern;

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {
	private static Samosa samosa;
	private Samosa() {
      if(samosa!=null)
			throw new RuntimeException("You are trying to break singleton pattern");
	}

	public static Samosa getSamosa() {
		if (samosa == null) {
			synchronized (Samosa.class) {
				samosa = new Samosa();
			}

		}
		return samosa;
	}

	public Object readResolve() {
		return samosa;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return samosa;
	}
}
