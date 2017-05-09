/*
 * This is a class of S3 state
 * The id of the S3 state is 4
 * In S3 state we can only perform Cancel() & SelectGas(int g)
 */
public class S3 extends State{
	int id = 4;
	public S3(OutPut outPut) {
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

	//Call CancelMsg and ReturnCash event of OutPut class
	@Override
	public void Cancel() {
		outPut.CancelMsg();
		outPut.ReturnCash();
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

	//Call SetPrice(g) event of OutPut class
	@Override
	public void SelectGas(int g) {
		outPut.SetPrice(g);
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
