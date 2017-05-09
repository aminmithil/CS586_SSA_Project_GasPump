/*
 * This class handle the event of ReturnCash for GasPump2
 */
public class ReturnCash2 extends ReturnCash{

	public ReturnCash2(Data data) {
		super(data);
	}
	
	//display the remaining cash for the GasPump2
	@Override
	public void ReturnCash() {
		Data2 d = (Data2) data;
        float returnCash = d.getCash() - d.getTotal();
        if (returnCash > 0) {
            System.out.println("Your Change : $" + returnCash);
        } else {
            System.out.println("No cash to return");
        }
        System.out.println("Transaction finished");
	}
}
