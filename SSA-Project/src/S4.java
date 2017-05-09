/*
 * This is a class of S4 state
 * The id of the S4 state is 5
 * In S4 state we can only perform StartPump()
 */
public class S4 extends State{
	int id = 5;
	public S4(OutPut outPut) {
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

	//Call SetInitialValues and ReadyMsg event of OutPut class
	@Override
	public void StartPump() {
		outPut.SetInitialValues();
		outPut.ReadyMsg();
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
