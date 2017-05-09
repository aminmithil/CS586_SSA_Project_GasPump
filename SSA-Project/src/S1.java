/*
 * This is a class of S1 state
 * The id of the S1 state is 2
 * In S1 state we can only perform PayType(int t)
 */
public class S1 extends State{
	int id = 2;
	public S1(OutPut outPut) {
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

	//if payment type is cash then call StoreCash and DisplayMenu event of OutPut class
	//if payment type credit then no event is called 
	@Override
	public void PayType(int t) {
		if(t == 1) {
			// if payment type is credit then no event for this action 
		} else if(t == 2) {
			//if payment type is cash then StoreCash and DisplayMenu are two actions
			outPut.StoreCash();
			outPut.DisplayMenu();
		}
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
