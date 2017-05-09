/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of StoreData event
 */
public abstract class StoreData {
	public Data data;
	
	public StoreData(Data data) {
		this.data = data;
	}
	
	public abstract void StoreData();
}
