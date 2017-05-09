/*
 * This class handle the event of PumpGasUnit for GasPump2
 */
public class PumpGasUnit2 extends PumpGasUnit{

	public PumpGasUnit2(Data data) {
		super(data);
	}

	//pour 1 more liter of gas and change the total according to if and display total price
	@Override
	public void PumpGasUnit() {
		Data2 d = (Data2) data;
		d.setL(d.getL()+1);
		d.setTotal(d.getL()*d.getPrice());
		System.out.println("Your poured Gas : " + d.getL() + " Liters");
		System.out.println("Your Total Amount : " + d.getTotal());
	}
}
