/*
 * This is a class of S2 state
 * The id of the S2 state is 3
 * In S2 state we can perform Reject() or Approved()
 */
public class S2 extends State{
	int id = 3;
	public S2(OutPut outPut) {
		super(outPut);
	}

	@Override
	public void Activate() {
		displayWrongStateMsg();
	}

	@Override
	public void Start() {
		displayWrongStateMsg();
	}

	@Override
	public void PayType(int t) {
		displayWrongStateMsg();
	}

	@Override
	public void Cancel() {
		displayWrongStateMsg();
	}

	//Call Reject event of OutPut class
	@Override
	public void Reject() {
		outPut.RejectMsg();
	}
	
	//Call Approved event of OutPut class
	@Override
	public void Approved() {
		outPut.DisplayMenu();
	}

	@Override
	public void StartPump() {
		displayWrongStateMsg();
	}

	@Override
	public void Pump() {
		displayWrongStateMsg();
	}

	@Override
	public void StopPump() {
		displayWrongStateMsg();
	}

	@Override
	public void SelectGas(int g) {
		displayWrongStateMsg();
	}

	@Override
	public void Receipt() {
		displayWrongStateMsg();
	}

	@Override
	public void NoReceipt() {
		displayWrongStateMsg();
	}

	//return state id
	@Override
	public int getStateId() {
		return id;
	}
}
