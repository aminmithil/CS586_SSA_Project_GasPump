/*
 * This is a class of start state
 * The id of the start state is 0
 * In start state we can only perform Activate()
 */
public class Start extends State{
	public int id = 0;
	public Start(OutPut outPut) {
		super(outPut);
	}

	//Call StoreData event of OutPut class
	@Override
	public void Activate() {
		outPut.StoreData();
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
		return this.id;
	} 
}
