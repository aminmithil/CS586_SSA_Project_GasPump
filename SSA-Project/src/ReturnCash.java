/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of ReturnCash event
 */
public abstract class ReturnCash {
	public Data data;
	
	ReturnCash(Data data) {
		this.data = data;
	}
	
	public abstract void ReturnCash();
}
