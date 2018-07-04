package dependencies;

import org.apache.commons.lang3.StringUtils;

/**
 * Klasa testowa dla zarz�dzania zale�no�ciami i 
 * wpinania plugin�w do cyklu budowania aplikacji
 * @author Slawek
 *
 */
public class NameVerifier {
	public static void main(String[] args) {
		String name = "�ukasz";
		System.out.println(StringUtils.isAlpha(name));
	}
	
	/**
	 * Metoda dodaj�ca dwie liczby ca�kowite
	 * @param a
	 * @param b
	 * @return suma parametr�w a i b
	 */
	public int add(int a, int b) {
		return a+b;
	}
}