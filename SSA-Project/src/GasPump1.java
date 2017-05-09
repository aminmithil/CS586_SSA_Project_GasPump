/*
 * This class represent a specific method to implement gas pump 
 * This class has an implementation of payment method credit card
 */
public class GasPump1 {
	public MDA_EFSM mdaEfsm; // pointer of MDA_EFSM object
	public Data1 data; // pointer of Data object
	
	public GasPump1(AbstractFactory abstractFactory) {
		mdaEfsm = new MDA_EFSM(new OutPut(abstractFactory)); // MDA_EFSM object initialize when the object of GasPump1 created  
		data = (Data1) abstractFactory.getData();  // data pointer sets from the concrete factory object
	}

	/*
	 * this method takes an input of Regular gas price and Super gas price
	 * call Activate method of MDA_EFSM class
	 */
	public void Activate (float a, float b) {
		if (a > 0 && b > 0) {
            data.setTemp_a(a); //store a in temporary variable
            data.setTemp_b(b); //store b in temporary variable
            mdaEfsm.Activate();
        } else {
            System.out.println("Activation failed!");
            System.out.println("a and b should be greater than '0'");
        }
	}
	
	//this method start the pump
	//call Start method of MDA_EFSM class
	public void Start() {
		mdaEfsm.Start();
	}
	
	// PayCredit option selected
	// call PayType method of MDA_EFSM class with parameter 1
	public void PayCredit() {
		mdaEfsm.PayType(1); //payment method is credit
	}
	
	//call Reject method of MDA_EFSM class
	public void Reject() {
		mdaEfsm.Reject();
	}
	
	//call Cancel method of MDA_EFSM class
	public void Cancel() {
		mdaEfsm.Cancel();
	}
	
	//call Approved method of MDA_EFSM class
	public void Approved() {
		mdaEfsm.Approved();
	}
	
	//call SelectGas method of MDA_EFSM class with parameter 2
	public void Super() {
		mdaEfsm.SelectGas(2); //super gas is selected
	}
	
	//call SelectGas method of MDA_EFSM class with parameter 1
	public void Regular() {
		mdaEfsm.SelectGas(1); //regular gas is selected
	}
	
	//call StartPump method of MDA_EFSM class
	public void StartPump() {
		mdaEfsm.StartPump();
	}
	
	//call Pump method of MDA_EFSM class
	public void PumpGallon() {
		mdaEfsm.Pump();
	}
	
	//call StopPump and Receipt method of MDA_EFSM class
	public void StopPump() {
		mdaEfsm.StopPump();
		mdaEfsm.Receipt();
	}
	
	//print the option of GasPump1
	public void displayMenu() {
		System.out.println("Gas Pump 1:" 
				+ "\n***** Operations *****" 
				+ "\n======================"
				+ "\n0 : Activate(float a, float b)"
				+ "\n1 : Start"
				+ "\n2 : PayCredit"
				+ "\n3 : Approved"
				+ "\n4 : Reject"
				+ "\n5 : Cancel"
				+ "\n6 : Regular Gas"
				+ "\n7 : Super Gas"
				+ "\n8 : StartPump"
				+ "\n9 : PumpGallon"
				+ "\n10 : StopPump"
				+ "\nq : Quit"
				+ "\n======================"
				);
	}
}
