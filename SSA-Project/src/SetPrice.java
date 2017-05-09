/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of SetPrice event
 */
public abstract class SetPrice {
	public Data data;
	
	public SetPrice (Data data) {
		this.data = data;
	}
	
	public abstract void SetPrice(int g);
}
