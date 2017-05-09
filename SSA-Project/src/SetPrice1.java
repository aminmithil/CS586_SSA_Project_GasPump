/*
 * This class handle the event of SetPrice for GasPump1
 */
public class SetPrice1 extends SetPrice{

	public SetPrice1(Data data) {
		super(data);
	}

	//set the price of the gas identified by g
	@Override
	public void SetPrice(int g) {
		Data1 d = (Data1) data;
		if (g == 1) { // Regular selected
            d.setPrice(d.getRprice());
        } else if (g == 2) { // Super selected
            d.setPrice(d.getSprice());
        }
        System.out.println("Your Selected Gas Pump Price is " + d.getPrice() + " per Gallon");
	}

}
