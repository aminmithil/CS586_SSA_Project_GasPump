/*
 * This is a class of S5 state
 * The id of the S5 state is 6
 * In S5 state we can perform Pump(), StopPump()
 */
public class S5 extends State{
	int id = 6;
	
	public S5(OutPut outPut) {
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

	//Call PumpGasUnit and GasPumpedMsg event of OutPut class
	@Override
	public void Pump() {
		outPut.PumpGasUnit();
		outPut.GasPumpedMsg();
	}

	//Call StopMsg event of OutPut class
	@Override
	public void StopPump() {
		outPut.StopMsg();
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
