/*
 * This class handle the event of DisplayMenu for GasPump2
 */
public class DisplayMenu2 extends DisplayMenu{

	public DisplayMenu2(Data data) {
		super(data);
	}

	//display menu with the list of available gases and cancel
	@Override
	public void DisplayMenu() {
		Data2 d = (Data2) data;
		System.out.println("Please Select the Option : ");
		System.out.println("3 : Cancel " 
							+ "\n4 : Premium Gas = " + d.getPprice()
							+ "\n5 : Regular Gas = " + d.getRprice()
							+ "\n6 : Super Gas = " + d.getSprice());
	}

}
