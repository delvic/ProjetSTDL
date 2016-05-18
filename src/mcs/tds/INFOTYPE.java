package mcs.tds;

import mcs.type.DTYPE;

public class INFOTYPE implements INFO {
	protected DTYPE type;

	public DTYPE getType() {
		return type;
	}
	
	public INFOTYPE(DTYPE t) {
		type = t;
	}
}
