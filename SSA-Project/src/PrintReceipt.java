/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of PrintReceipt event
 */
public abstract class PrintReceipt {
	public Data data;
	
	public PrintReceipt(Data data) {
		this.data = data;
	}
	
	public abstract void PrintReceipt();
}
