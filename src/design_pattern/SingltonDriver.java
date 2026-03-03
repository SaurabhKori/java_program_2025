package design_pattern;

public class SingltonDriver {
	public static void main(String[] args) throws Exception {
		Samosa samosa = Samosa.getSamosa();

		System.out.println(samosa.hashCode());


		/*
		 * How to Break Singleton Design Pattern
		 * 
		 * 1 Using Reflection API to break singleton pattern solution -> if object is
		 * there ==> throw exception from inside constructor ->use enum 
		 * Problem 2 Deserialization; 
		 * solution by using implements readResolve method
		 * Problem 3. cloning
		 */
//		Constructor<Samosa> constructer = Samosa.class.getDeclaredConstructor();
//		constructer.setAccessible(true);
//		Samosa s1 = constructer.newInstance();
//		System.out.println(s1.hashCode());

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//		oos.writeObject(samosa);
//		System.out.println("Serilization Done");
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//		Samosa s2 = (Samosa) ois.readObject();
//		System.out.println(s2.hashCode());
		Samosa s2=(Samosa)samosa.clone();
		System.out.println(s2.hashCode());

	}
}
