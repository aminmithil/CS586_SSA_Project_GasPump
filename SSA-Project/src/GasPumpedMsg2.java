/*
 * This class handle the event of GasPumpedMsg for GasPump2
 */
public class GasPumpedMsg2 extends GasPumpedMsg{

	public GasPumpedMsg2(Data data) {
		super(data);
	}

	//display the quantity of poured gas in liter
	@Override
	public void GasPumpedMsg() {
		Data2 d = (Data2) data;
		System.out.println("Total Gas Poured : " + d.getL() + "Liters");
	}
}
