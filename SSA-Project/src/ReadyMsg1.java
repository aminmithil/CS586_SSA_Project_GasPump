/*
 * This class handle the event of ReadyMsg for GasPump1
 */
public class ReadyMsg1 extends ReadyMsg{

	public ReadyMsg1(Data data) {
		super(data);
	}

	//display ready message for gas pump 1 and display the price of the selected gas
	@Override
	public void ReadyMsg() {
		Data1 d = (Data1) data;
		System.out.println("GasPump is  Ready");
		System.out.println("Your selected gas price is : " + d.getPrice() + "/gallon");
		System.out.println("9 : Fill 1 Gallon of Gas");
		System.out.println("10 : Stop Pump");
	}

}
