/*
 * This class handle the event of ReadyMsg for GasPump2
 */
public class ReadyMsg2 extends ReadyMsg{

	public ReadyMsg2(Data data) {
		super(data);
	}

	//display ready message for gas pump 2 and display the price of the selected gas
	@Override
	public void ReadyMsg() {
		Data2 d = (Data2) data;
		System.out.println("GasPump is  Ready");
		System.out.println("Your selected gas price is : " + d.getPrice() + "/liter");
		System.out.println("8 : Fill 1 Gallon of Gas");
		System.out.println("9 : Stop Pump");
	}

}
