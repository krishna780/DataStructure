package Collection;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to java";
		// for (int i = 0; i < str.length(); i++) {
		// System.out.println(str.charAt(i)); }
		String st = "welcome";
		st.concat("java");
		System.out.println(st);
		Integer value = new Integer(7);
		System.out.println(value.hashCode());
		Integer val = 7;
		System.out.println(val.hashCode());
		System.out.println(val == value);
		System.out.println(Integer.MIN_VALUE);

	}

}
