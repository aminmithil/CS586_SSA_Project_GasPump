/*
 * This class handle the event of StoreData for GasPump2
 */
public class StoreData2 extends StoreData{

	public StoreData2(Data data) {
		super(data);
	}

	//Store the value of Rprice, Pprice and Sprice in data2
	@Override
	public void StoreData() {
		Data2 d = (Data2) data; 
		d.setRprice(d.getTemp_a()); //set price of Regular gas
		d.setPprice(d.getTemp_b()); //set price of Premium gas
		d.setSprice(d.getTemp_c()); //set price of Super gas
		System.out.println("Gas Pump-2 activate method run successfully");
	}
}
