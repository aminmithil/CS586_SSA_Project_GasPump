/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of GasPumpedMsg event
 */
public abstract class GasPumpedMsg {
	public Data data;
	
	public GasPumpedMsg(Data data) {
		this.data = data;
	}
	
	public abstract void GasPumpedMsg();
}
