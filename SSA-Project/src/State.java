/*
 * This is an abstract class of the state design pattern
 * This is the parent class of all states
 */
public abstract class State {
	public OutPut outPut; //pointer of OutPut instance 
	public State (OutPut outPut) {
		this.outPut = outPut;
	}
	
	//these all are abstract methods
	public abstract void Activate();
	public abstract void Start();
	public abstract void PayType(int t);
	public abstract void Reject();
	public abstract void Cancel();
	public abstract void Approved();
	public abstract void StartPump();
	public abstract void Pump();
	public abstract void StopPump();
	public abstract void SelectGas(int g);
	public abstract void Receipt();
	public abstract void NoReceipt();
	public abstract int getStateId();
	
	//if action cannot be perform in the state then display message
	public void displayWrongStateMsg() {
		System.out.println("This Action Can not Be performed in this state");
	}
}
