package mcs.type;

import java.util.ArrayList;

public class LTYPES extends ArrayList<DTYPE> {

	public int getTaille() {
		int t = 0;
		for (DTYPE dt : this) {
			t += dt.getTaille();
		}
		return t;
	}

	public void inserer(DTYPE t) {
		add(t);
	}

/*
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (CHAMP c : this) {
			sb.append(c + ", ");
		}
		return sb.toString();
	}
*/
	public boolean compareTo(LTYPES autre) {
		int lc = size();
		int lca = autre.size();
		if (lc != lca)
			return false;
		for (int i = 0; i < lc; i++) {
			DTYPE c = get(i);
			DTYPE ca = autre.get(i);
			if (!c.compareTo(ca)) {
				return false;
		    }
		}
		return true;
	}
}