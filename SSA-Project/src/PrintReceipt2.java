/*
 * This class handle the event of PrintReceipt for GasPump2
 */
public class PrintReceipt2 extends PrintReceipt{

	public PrintReceipt2(Data data) {
		super(data);
	}

	//display receipt()
	@Override
	public void PrintReceipt() {
		Data2 d = (Data2) data;
		System.out.println("Your Receipt : ");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Your choosen fuel price                   : " + d.getPrice());
		System.out.println("The Total Amount Of Fuel Poured in Liters : " + d.getL());
		System.out.println("Total                                     : " + d.getTotal());
		System.out.println("You Paid                                  : " + d.getCash());
		System.out.println("Change                                    : " + (d.getTotal() - d.getCash()));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
