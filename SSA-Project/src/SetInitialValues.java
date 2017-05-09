/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of SetInitialValues event
 */
public abstract class SetInitialValues {
	public Data data;
	
	public SetInitialValues(Data data) {
		this.data = data;
	}
	
	public abstract void SetInitialValues();
}
