/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of DisplayMenu event
 */
public abstract class DisplayMenu {
	public Data data;
	
	public DisplayMenu(Data data) {
		this.data = data;
	}
	
	public abstract void DisplayMenu();
}
