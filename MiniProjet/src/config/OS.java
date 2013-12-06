/**
 * @author Marc
 */
package config;

//Enum for the OS of equipment available in the smartphone or pad
public enum OS {
	IOS5("iOS_5"), ANDROID41("Android 4.1"), ANDROID43("Android 4.3");

	private String name;

	private OS(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}