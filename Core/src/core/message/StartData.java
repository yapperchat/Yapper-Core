package core.message;

import core.misc.Misc;

public class StartData extends Message {

	private static final long serialVersionUID = 1L;
	
	public StartData(String text, String user, String id) {
		super(text, Misc.getTime(), user, id);
	}

}
