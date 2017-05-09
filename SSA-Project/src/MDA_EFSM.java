/*
 * In centralize state pattern this class is responsible for changing states
 * This class calls all the operation of platform independent module
 * calls operations in their respective states
 */
public class MDA_EFSM {
	public State state; //this instance point to the current state object
	public State[] ls; //this is an list of states
	
	public MDA_EFSM(OutPut outPut) {
		/*
		 * This is an implementation of state design pattern
		 * store the different states in the list
		 */
		ls = new State[8]; //list of state
		ls[0] = new Start(outPut);
		ls[1] = new S0(outPut);
		ls[2] = new S1(outPut);
		ls[3] = new S2(outPut);
		ls[4] = new S3(outPut);
		ls[5] = new S4(outPut);
		ls[6] = new S5(outPut);
		ls[7] = new S6(outPut);
		state = ls[0]; //set current state as start state in beginning
	}
	
	//calls Activate method of Start state and change state to S0
	public void Activate() {
		state.Activate(); //action
		if(state.getStateId() == 0) { 
			state = ls[1]; //change of state
		}
	}
	
	//calls Start method of S0 state and change state to S1
	public void Start() {
		state.Start(); //action
		if(state.getStateId() == 1) {
			state = ls[2]; //change of state
		}
	}
	
	//calls PayType method of S1 state
	//if payment type is 1 then change state to S2
	//if payment type is 2 then change state to S3
	public void PayType(int t){
		if(t == 1) {
			// pay credit
			state.PayType(t); //action
			if(state.getStateId() == 2) {
				state = ls[3]; //change of state
			}
		} else if(t == 2) {
			// pay cash
			state.PayType(t); //action
			if(state.getStateId() == 2) {
				state = ls[4]; //change of state
			}
		}
	}
	
	//calls Reject method of S2 state and change state to S0
	public void Reject() {
		state.Reject(); //action
		if(state.getStateId() == 3) {
			state = ls[1]; //change of state
		}
	}
	
	//calls Cancel method of S3 state and change state to S0
	public void Cancel() {
		state.Cancel(); //action
		if(state.getStateId() == 4) {
			state = ls[1]; //change of state
		}
	}
	
	//calls Approved method of S2 state and change state to S3
	public void Approved() {
		state.Approved(); //action
		if(state.getStateId() == 3) {
			state = ls[4]; //change of state
		}
	}
	
	//calls SelectGas method of S3 state and change state to S4
	public void SelectGas(int g) {
		state.SelectGas(g); //action
		if(state.getStateId() == 4) {
			state = ls[5]; //change of state
		}
	}
	
	//calls StartPump method of S4 state and change state to S5
	public void StartPump() {
		state.StartPump(); //action
		if(state.getStateId() == 5) {
			state = ls[6]; //change of state
		}
	}
	
	//calls Pump method of S5 state and no change of state
	public void Pump() {
		state.Pump(); //action
					  //no change of state
	}

	//calls StopPump method of S5 state and change state to S6
	public void StopPump() {
		state.StopPump(); //action
		if(state.getStateId() == 6) {
			state = ls[7]; //change of state
		}
	}
	
	//calls Receipt method of S6 state and change state to S0
	public void Receipt() {
		state.Receipt(); //action
		if(state.getStateId() == 7) {
			state = ls[1]; //change of state
		}
	}
	
	//calls Receipt method of S6 state and change state to S0
	public void NoReceipt() {
		state.NoReceipt(); //action
		if(state.getStateId() == 7) {
			state = ls[1]; //change of state
		}
	}
}
