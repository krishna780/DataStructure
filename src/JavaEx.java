import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEx {

	public static void main(String[] args) throws Exception {
		/*
		 * String str1 = "welcome"; String str2 = "WELcome"; String str3 = "welcome"; //
		 * System.out.println(str1.compareTo(str2)); //
		 * System.out.println(str1.substring(17)); String[] ch = str1.split(" ");
		 * 
		 * Map<String, Long> map = Arrays.stream(ch).collect(Collectors.groupingBy(c ->
		 * c, Collectors.counting())); System.out.println(map.values());
		 * 
		 * String s = "mmababctamantlslmag"; int distinct = 0;
		 * 
		 * for (int i = 0; i < s.length(); i++) {
		 * 
		 * for (int j = 0; j < s.length(); j++) {
		 * 
		 * if (s.charAt(i) == s.charAt(j)) { distinct++;
		 * 
		 * } } System.out.println(s.charAt(i) + "--" + distinct); String d =
		 * String.valueOf(s.charAt(i)).trim(); s = s.replaceAll(d, ""); distinct = 0;
		 * 
		 * }
		 */
		String s1 = "welcome to java world";
		String[] string = s1.split("");
		for (String string2 : string) {
			System.out.println(string2);
		}
	}

}
