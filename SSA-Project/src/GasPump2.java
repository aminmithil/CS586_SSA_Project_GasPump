/*
 * This class represent a specific method to implement gas pump 
 * This class has an implementation of payment method cash
 */
public class GasPump2 {
	public MDA_EFSM mdaEfsm; // pointer of MDA_EFSM object
	public Data2 data; // pointer of Data object
	
	public GasPump2(AbstractFactory abstractFactory) {
		mdaEfsm = new MDA_EFSM(new OutPut(abstractFactory));  // MDA_EFSM object initialize when the object of GasPump2 created
		data = (Data2) abstractFactory.getData(); // data pointer sets from the concrete factory object
	}
	
	/*
	 * this method takes an input of regular gas price, Super gas price and Premium gas price
	 * call Activate method of MDA_EFSM class
	 */
	public void Activate(int a, int b, int c) {
		if( a>0 && b>0 && c>0) {
			data.setTemp_a(a); //store a in temporary variable
			data.setTemp_b(b); //store b in temporary variable
			data.setTemp_c(c); //store c in temporary variable
			mdaEfsm.Activate();
		} else {
			System.out.println("a, b, c should be greater than 0");
			System.out.println("activation fail");
		}
	}
	
	//this method start the pump
	//call Start method of MDA_EFSM class
	public void Start() {
		mdaEfsm.Start();
	}
	
	// call PayType method of MDA_EFSM class with parameter 2
	// store inserted cash into temporary variable
	public void PayCash(int c) {
		if(c>0){
			data.setTemp_cash(c); //store cash in temporary variable
			mdaEfsm.PayType(2); //payment method is cash
		}
	}
	
	//call Cancel method of MDA_EFSM class
	public void Cancel() {
		mdaEfsm.Cancel();
	}
	
	//call SelectGas method of MDA_EFSM class with parameter 3
	public void Premium() {
		mdaEfsm.SelectGas(3); //premium gas selected
	}
	
	//call SelectGas method of MDA_EFSM class with parameter 1
	public void Regular() {
		mdaEfsm.SelectGas(1); //regular gas selected
	}
	
	//call SelectGas method of MDA_EFSM class with parameter 2
	public void Super() {
		mdaEfsm.SelectGas(2); //super gas selected
	}
	
	//call StartPump method of MDA_EFSM class
	public void StartPump() {
		mdaEfsm.StartPump();
	}
	
	//if has enough cash available for more gas then call Pump method of MDA_EFSM
	//if don't have enough cash available for more gas then call StopPump method of MDA_EFSM 
	public void PumpLiter() {
		if(data.getCash() < ((data.getL())+1) * data.getPrice()) { //check that is enough cash available for more gas
			mdaEfsm.StopPump();
		} else {
			mdaEfsm.Pump();
		}
	}
	
	//call StopPump method of MDA_EFSM class
	public void Stop() {
		mdaEfsm.StopPump();
	}
	
	//call Receipt method if MDA_EFSM class
	public void Receipt() {
		mdaEfsm.Receipt();
	}
	
	//call NoReceipt method of MDA_EFSM class
	public void NoReceipt() {
		mdaEfsm.NoReceipt();
	}
	
	//display option of GasPump2
	public void displayMenu() {
		System.out.println("Gas Pump 2:" 
				+ "\n***** Operations *****" 
				+ "\n======================"
				+ "\n0 : Activate(int a, int b, int c)"
				+ "\n1 : Start"
				+ "\n2 : PayCash(int c)"
				+ "\n3 : Cancel"
				+ "\n4 : Premium Gas"
				+ "\n5 : Regular Gas"
				+ "\n6 : Super Gas"
				+ "\n7 : StartPump"
				+ "\n8 : PumpLiter"
				+ "\n9 : StopPump"
				+ "\n10 : Receipt"
				+ "\n11 : NoReceipt"
				+ "\nq : Quit"
				+ "\n======================"
				);
	}
}
