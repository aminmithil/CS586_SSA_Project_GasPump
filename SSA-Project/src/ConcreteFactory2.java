/*
 * This class is a part of the AbstractFactory design pattern
 * It is responsible to create objects of all the events which are related to GasPump2
 */
public class ConcreteFactory2 extends AbstractFactory{
	private Data2 data2;
	
	public ConcreteFactory2() {
		data2 = new Data2(); //create an instance of data2
	}
	
	//returns StoreData2 object
	@Override
	public StoreData getStoreData() {
		return new StoreData2(this.data2);
	}

	//returns PayMsg2 object
	@Override
	public PayMsg getPayMsg() {
		return new PayMsg2();
	}

	//returns DisplayMenu2 object
	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu2(this.data2);
	}

	//returns SetInitialValues2 object
	@Override
	public SetInitialValues getSetInitialValues() {
		return new SetInitialValues2(this.data2);
	}

	//returns PumpGasUnit2 object
	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit2(this.data2);
	}

	//returns GasPumpedMsg2 object
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg2(this.data2);
	}

	//returns PrintReceipt2 object
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt2(this.data2);
	}

	//returns CancelMsg2 object
	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg2();
	}

	//returns SetPrice2 object
	@Override
	public SetPrice getSetPrice() {
		return new SetPrice2(this.data2);
	}

	//returns ReadyMsg2 object
	@Override
	public ReadyMsg getReadyMsg() {
		return new ReadyMsg2(this.data2);
	}

	//returns StoreCash2 object
	@Override
	public StoreCash getStoreCash() {
		return new StoreCash2(this.data2);
	}

	//returns RejectMsg2 object
	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg2();
	}

	//returns StopMsg2 object
	@Override
	public StopMsg getStopMsg() {
		return new StopMsg2();
	}

	//returns ReturnCash2 object
	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash2(this.data2);
	}

	//returns Data instance
	@Override
	public Data getData() {
		return this.data2;
	}	
}
