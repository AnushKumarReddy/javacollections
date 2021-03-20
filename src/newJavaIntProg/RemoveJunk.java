package newJavaIntProg;

public class RemoveJunk {
	public static void main(String[] args) {
		String jumk="148641!@%$#^$E&%^&^%$^%anush $#%@#$@^#$reddy";
		String all = jumk.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(all);
	}

}
