/*
 * This class is a part of the AbstractFactory design pattern
 * It is responsible to create objects of all the events which are related to GasPump1
 */
public class ConcreteFactory1 extends AbstractFactory{
	
	private Data1 data1; //pointer of a Data1 object
	
	public ConcreteFactory1() {
		data1 = new Data1(); //create a object of data1
	}
	
	//returns Data instance
	public Data getData() {
		return data1;
	}

	//returns StoreData1 object
	@Override
	public StoreData getStoreData() {
		return new StoreData1(this.data1);
	}

	//returns PayMsg1 object
	@Override
	public PayMsg getPayMsg() {
		return new PayMsg1();
	}

	//returns DisplayMenu1 object
	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu1(this.data1);
	}

	//returns SetInitialValues1 object
	@Override
	public SetInitialValues getSetInitialValues() {
		return new SetInitialValues1(this.data1);
	}

	//returns PumpGasUnit1 object
	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit1(this.data1);
	}

	//returns GasPumpedMsg1 object
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg1(this.data1);
	}

	//returns PrintReceipt1 object
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt1(this.data1);
	}

	//returns CancelMsg1 object
	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg1();
	}

	//returns SetPrice1 object
	@Override
	public SetPrice getSetPrice() {
		return new SetPrice1(this.data1);
	}

	//returns ReadyMsg1 object
	@Override
	public ReadyMsg getReadyMsg() {
		return new ReadyMsg1(this.data1);
	}

	//returns StoreCash1 object
	@Override
	public StoreCash getStoreCash() {
		return new StoreCash1(this.data1);
	}

	//returns RejectMsg1 object
	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg1();
	}

	//returns StopMsg1 object
	@Override
	public StopMsg getStopMsg() {
		return new StopMsg1();
	}

	//returns ReturnCash1 object
	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash1(this.data1);
	}	
}
