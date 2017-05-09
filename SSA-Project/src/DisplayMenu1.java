/*
 * This class handle the event of DisplayMenu for GasPump2
 */
public class DisplayMenu1 extends DisplayMenu{

	public DisplayMenu1(Data data) {
		super(data);
	}

	//display a menu with list available gases and cancel
	@Override
	public void DisplayMenu() {
		Data1 d = (Data1) data;
		System.out.println("Credit Card Approved"); 
		System.out.println("Please Select the Option : ");
		System.out.println("5 : Cancel " 
							+ "\n6 : Regular Gas = " + d.getRprice()
							+ "\n7 : Super Gas = " + d.getSprice());
 	}

}
