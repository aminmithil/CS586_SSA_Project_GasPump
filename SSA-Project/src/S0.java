/*
 * This is a class of S0 state
 * The id of the S0 state is 1
 * In S0 state we can only perform Start()
 */
public class S0 extends State{
	int id = 1;
	
	public S0(OutPut outPut) {
		super(outPut);
	}

	@Override
	public void Activate() {
		displayWrongStateMsg();
	}

	//Call PayMsg event of OutPut class
	@Override
	public void Start() {
		outPut.PayMsg();
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
