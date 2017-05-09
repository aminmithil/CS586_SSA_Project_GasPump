/*
 * This class handle the event of StoreCash for GasPump2
 */
public class StoreCash2 extends StoreCash{

	public StoreCash2(Data data) {
		super(data);
	}

	//store cash from temporary data store
	@Override
	public void StoreCash() {
		Data2 d = (Data2) data;
		d.setCash(d.getTemp_cash()); //store cash in cash variable
		System.out.println("Total Cash You Inserted : " + d.getCash());
	}
}
