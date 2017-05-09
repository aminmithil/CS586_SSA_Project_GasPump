/*
 * This class handle the event of PumpGasUnit for GasPump1
 */
public class PumpGasUnit1 extends PumpGasUnit{

	public PumpGasUnit1(Data data) {
		super(data);
	}

	//pour 1 more gallon of gas and change the total according to if and display total price
	@Override
	public void PumpGasUnit() {
		Data1 d = (Data1) data;
		d.setG(d.getG()+1);
		d.setTotal(d.getPrice()*d.getG());
		System.out.println("Your Total Amount : " + d.getTotal());
	}
}
