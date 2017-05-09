/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of ReadyMsg event
 */
public abstract class ReadyMsg {
	public Data data;
	
	public ReadyMsg(Data data) {
		this.data = data;
	}
	
	public abstract void ReadyMsg();
}
