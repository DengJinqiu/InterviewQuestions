package min.unrecognized.characters;

import java.util.HashSet;
import java.util.Set;

public class MinUnrecChar {
	
	public Set<String> dic = new HashSet<String>();
	
	private class Res {
		int c;
		String s;
		Res() {
			c = Integer.MAX_VALUE;
			s = "";
		}
	}
	
	public String find(String s) {
		Res[] res = new Res[s.length()];
		for (int i = s.length()-1; i >= 0; i--) {
			res[i] = new Res();
			for (int j = i; j < s.length(); j++) {
				int temp = 0;
				StringBuilder ss = new StringBuilder(s.substring(i, j+1));
				if (!dic.contains(s.substring(i, j+1))) {
					temp += j-i+1;
					for (int k = 0; k < ss.length(); k++) {
						ss.setCharAt(k, Character.toUpperCase(ss.charAt(k)));
					}
				}
				temp += j+1 < s.length() ? res[j+1].c : 0;
				if (temp <= res[i].c) {
					res[i].c = temp;
					res[i].s = ss.toString();
					if (j+1 < s.length()) {
						res[i].s += " " + res[j+1].s;
					}
				}
			}
		}
		return res[0].s;
	}
	
}
