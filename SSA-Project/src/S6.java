/*
 * This is a class of S6 state
 * The id of the S6 state is 7
 * In S6 state we can perform Receipt() & NoReceipt()
 */
public class S6 extends State{
	int id = 7;
	public S6(OutPut outPut) {
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
	public void Reject() {
		displayWrongStateMsg();
	}

	@Override
	public void Cancel() {
		displayWrongStateMsg();
	}

	@Override
	public void Approved() {
		displayWrongStateMsg();
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

	//Call PrintReceipt and ReturnCash event of OutPut class
	@Override
	public void Receipt() {
		outPut.PrintReceipt();
		outPut.ReturnCash();
	}

	//Call ReturnCash event of OutPut class
	@Override
	public void NoReceipt() {
		outPut.ReturnCash();
	}

	//return state id
	@Override
	public int getStateId() {
		return id;
	}
}
