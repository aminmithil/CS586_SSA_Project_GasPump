/*
 * This class handle the event of SetPrice for GasPump2
 */
public class SetPrice2 extends SetPrice{

	public SetPrice2(Data data) {
		super(data);
	}

	//set the price of gas identified by g
	@Override
	public void SetPrice(int g) {
		Data2 d = (Data2) data;
		if (g == 1) { 
            d.setPrice(d.getRprice());
        } else if (g == 2) { 
            d.setPrice(d.getSprice());
        } else if(g == 3) {
        	d.setPrice(d.getPprice());
        }
        System.out.println("Your Selected Gas Pump Price is " + d.getPrice() + " per Liter");
	}
}
