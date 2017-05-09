/*
 * This class handle the event of PrintReceipt for GasPump1
 */
public class PrintReceipt1 extends PrintReceipt{

	public PrintReceipt1(Data data) {
		super(data);
	}

	//display receipt
	@Override
	public void PrintReceipt() {
		Data1 d = (Data1) data;
		System.out.println("Your Receipt : ");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Your choosen fuel price                   : " + d.getPrice());
		System.out.println("The Total Amount Of Fuel Poured in Gallon : " + d.getG());
		System.out.println("Total                                     : " + d.getTotal());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
