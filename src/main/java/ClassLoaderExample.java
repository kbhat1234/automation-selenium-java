
public class ClassLoaderExample {

	public static void main(String[] args) {
		Class c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		System.out.println(String.class.getClassLoader());

	}

}
