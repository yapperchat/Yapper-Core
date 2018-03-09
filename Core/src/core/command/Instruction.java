package core.command;

import java.io.Serializable;

import core.application.Application;

public interface Instruction extends Serializable {
	public void run(Application application, String[] args);
}
