import controller.Controller;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controller c = new Controller("inventory", "users", "v1");
		c.startDemo();
	}

}
