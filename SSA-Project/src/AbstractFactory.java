/*
 * This is an abstract class of AbstractFactory Design pattern
 * This class declare all the methods which are implemented in the Abstract factory pattern
 * All these methods return object based on their Factory 
 */
public abstract class AbstractFactory {
	public abstract StoreData getStoreData();
	public abstract PayMsg getPayMsg();
	public abstract StoreCash getStoreCash();
	public abstract DisplayMenu getDisplayMenu();
	public abstract RejectMsg getRejectMsg();
	public abstract SetPrice getSetPrice();
	public abstract ReadyMsg getReadyMsg();
	public abstract SetInitialValues getSetInitialValues();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract GasPumpedMsg getGasPumpedMsg();
	public abstract StopMsg getStopMsg();
	public abstract PrintReceipt getPrintReceipt();
	public abstract CancelMsg getCancelMsg();
	public abstract ReturnCash getReturnCash();
	
	public abstract Data getData();
}
