/*
 * This class handle the event of StoreData for GasPump1
 */
public class StoreData1 extends StoreData{

	public StoreData1(Data data) {
		super(data);
	}

	//Store the value of Rprice and Sprice in data1
	@Override
	public void StoreData() {
		Data1 d = (Data1) data;
		d.setRprice(d.getTemp_a()); //set price of Regular gas
		d.setSprice(d.getTemp_b()); //set price of Super gas
		System.out.println("Gas Pump-1 activate method run successfully");
	}
}
