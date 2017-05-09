/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of StoreCash event
 */
public abstract class StoreCash {
	public Data data;
	
	public StoreCash(Data data) {
		this.data = data;
	}
	
	public abstract void StoreCash();
}
