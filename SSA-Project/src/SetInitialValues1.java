/*
 * This class handle the event of SetInititalValues for GasPump1
 */
public class SetInitialValues1 extends SetInitialValues{

	public SetInitialValues1(Data data) {
		super(data);
	}

	//set G and total to 0
	@Override
	public void SetInitialValues() {
		Data1 d = (Data1) data;
		d.setG(0);
		d.setTotal(0);
	}

}
