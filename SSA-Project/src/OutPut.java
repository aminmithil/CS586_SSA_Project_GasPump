/*
 * This is an output class in which events are going to call by the state class after action is completed
 */
public class OutPut {
	public AbstractFactory abstractFactory; // pointer to the AbstractFactory instance
	
	// strategy design pattern
	public StoreData storeData;
	public PayMsg payMsg;
	public StoreCash storeCash;
	public DisplayMenu displayMenu;
	public RejectMsg rejectMsg;
	public SetPrice setPrice;
	public ReadyMsg readyMsg;
	public SetInitialValues setInitialValues;
	public PumpGasUnit pumpGasUnit;
	public GasPumpedMsg gasPumpedMsg;
	public StopMsg stopMsg;
	public PrintReceipt printReceipt;
	public CancelMsg cancelMsg;
	public ReturnCash returnCash;
	
	public OutPut(AbstractFactory abstractFactory) {
		this.abstractFactory = abstractFactory; //set AbstractFactory object
		
		//implementation of Abstract Factory pattern
		setStoreData(abstractFactory.getStoreData()); //get StoreData object from AbstractFarctory and set it
		setPayMsg(abstractFactory.getPayMsg()); //get PayMsg object from AbstractFarctory and set it
		setStoreCash(abstractFactory.getStoreCash()); //get StoreCash object from AbstractFarctory and set it
		setDisplayMenu(abstractFactory.getDisplayMenu()); //get DisplayMenu object from AbstractFarctory and set it
		setRejectMsg(abstractFactory.getRejectMsg()); //get RejectMsg object from AbstractFarctory and set it
		setSetPrice(abstractFactory.getSetPrice()); //get SetPrice object from AbstractFarctory and set it
		setReadyMsg(abstractFactory.getReadyMsg()); //get ReadyMsg object from AbstractFarctory and set it
		setSetInitialValues(abstractFactory.getSetInitialValues()); //get SetInitialValues object from AbstractFarctory and set it
		setPumpGasUnit(abstractFactory.getPumpGasUnit()); //get PumpGasUnit object from AbstractFarctory and set it
		setGasPumpedMsg(abstractFactory.getGasPumpedMsg()); //get GasPumpedMsg object from AbstractFarctory and set it
		setStopMsg(abstractFactory.getStopMsg()); //get StopMsg object from AbstractFarctory and set it
		setPrintReceipt(abstractFactory.getPrintReceipt()); //get PrintReceipt object from AbstractFarctory and set it
		setCancelMsg(abstractFactory.getCancelMsg()); //get CancelMsg object from AbstractFarctory and set it
		setReturnCash(abstractFactory.getReturnCash()); //get returnCash object from AbstractFarctory and set it
	}
	
	//set StoreData object
	public void setStoreData(StoreData storeData){
		this.storeData = storeData;
	}
	
	//set PayMsg object
	public void setPayMsg(PayMsg payMsg) {
		this.payMsg = payMsg;
	}
	
	//set DisplayMenu object
	public void setDisplayMenu (DisplayMenu displayMenu) {
		this.displayMenu = displayMenu;
	}
	
	//set SetPrice object
	public void setSetPrice(SetPrice setPrice) {
		this.setPrice = setPrice;
	}
	
	//set ReadyMsg object
	public void setReadyMsg(ReadyMsg readyMsg) {
		this.readyMsg = readyMsg;
	}
	
	//set SetInitialValues object
	public void setSetInitialValues(SetInitialValues setInitialValues) {
		this.setInitialValues = setInitialValues;
	}
	
	//set PumpGasUnit object
	public void setPumpGasUnit(PumpGasUnit pumpGasUnit) {
		this.pumpGasUnit = pumpGasUnit;
	}
	
	//set GasPumpedMsg object
	public void setGasPumpedMsg(GasPumpedMsg gasPumpedMsg) {
		this.gasPumpedMsg = gasPumpedMsg;
	}
	
	//set PrintReceit object
	public void setPrintReceipt(PrintReceipt printReceipt) {
		this.printReceipt = printReceipt;
	}
	
	//set CancelMsg object
	public void setCancelMsg(CancelMsg cancelMsg) {
		this.cancelMsg = cancelMsg;
	}
	
	//set StoreCash object
	public void setStoreCash(StoreCash storeCash) {
		this.storeCash = storeCash;
	}
	
	//set RejectMsg object
	public void setRejectMsg(RejectMsg rejectMsg) {
		this.rejectMsg = rejectMsg;
	}
	
	//set StopMsg object
	public void setStopMsg(StopMsg stopMsg) {
		this.stopMsg = stopMsg;
	}
	
	//set ReturnCash object
	public void setReturnCash(ReturnCash returnCash) {
		this.returnCash = returnCash;
	}
	
	//call StoreData of StoreData class
	public void StoreData() {
		this.storeData.StoreData();
	}
	
	//call PayMsg of PayMsg class
	public void PayMsg() {
		this.payMsg.PayMsg();
	}
	
	//call StoreCash of StoreCash class
	public void StoreCash() {
		this.storeCash.StoreCash();
	}
	
	//call DisplayMenu of DisplayMenu class
	public void DisplayMenu() {
		this.displayMenu.DisplayMenu();
	}
	
	//call RejectMsg of RejectMsg class
	public void RejectMsg() {
		this.rejectMsg.RejectMsg();
	}
	
	//call SetPrice of SetPrice class
	public void SetPrice(int g) {
		this.setPrice.SetPrice(g);
	}
	
	//call ReadyMsg of ReadyMsg class
	public void ReadyMsg() {
		this.readyMsg.ReadyMsg();
	}
	
	//call SetInitialValues of SetInitialValues class
	public void SetInitialValues() {
		this.setInitialValues.SetInitialValues();
	}
	
	//call PumpGasUnit of PumpGasUnit class
	public void PumpGasUnit() {
		this.pumpGasUnit.PumpGasUnit();
	}
	
	//call GasPumpedMsg of GasPumpedMsg class
	public void GasPumpedMsg() {
		this.gasPumpedMsg.GasPumpedMsg();
	}
	
	//call StopMsg of StopMsg class
	public void StopMsg() {
		this.stopMsg.StopMsg();
	}
	
	//call PrintReceipt of PrintReceipt class
	public void PrintReceipt() {
		this.printReceipt.PrintReceipt();
	}
	
	//call CancelMsg of CancelMsg class
	public void CancelMsg() {
		this.cancelMsg.CancelMsg();
	}
	
	//call ReturnCash of ReturnCash class
	public void ReturnCash() {
		this.returnCash.ReturnCash();
	}
}
