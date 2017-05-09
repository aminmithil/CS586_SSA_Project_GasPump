/*
 * This class handle the event of RejectMsg for GasPump1
 */
public class RejectMsg1 extends RejectMsg{

	//display credit card not approved message
	@Override
	public void RejectMsg() {
		System.out.println("Credit Card Not Approved");
	}
}
