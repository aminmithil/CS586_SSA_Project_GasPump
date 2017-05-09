/*
 * This class handle the event of GasPumpedMsg for GasPump1
 */
public class GasPumpedMsg1 extends GasPumpedMsg{

	public GasPumpedMsg1(Data data) {
		super(data);
	}

	//display the quantity of poured gas in gallon
	@Override
	public void GasPumpedMsg() {
		Data1 d = (Data1) data;
		System.out.println("Total Gas Poured : " + d.getG() + "Gallons");
	}
}
