package core.command;

public abstract class Command {
	
	public Command (CommandRegistrar reg) {
		reg.addCommand(this);
	}
	
	public abstract void run(String[] args);
	public abstract String[] getTriggers();
	
	public String getInfo() {
		return "N/A";
	}
	
}