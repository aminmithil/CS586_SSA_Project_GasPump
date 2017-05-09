/*
 * This class handle the event of SetInitialValues for GasPump2
 */
public class SetInitialValues2 extends SetInitialValues{

	public SetInitialValues2(Data data) {
		super(data);
	}

	//set L and total 0
	@Override
	public void SetInitialValues() {
		Data2 d = (Data2) data;
		d.setL(0);
		d.setTotal(0);
	}
}
