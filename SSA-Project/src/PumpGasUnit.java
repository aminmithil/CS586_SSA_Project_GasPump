/*
 * This is an implementation of Strategy Design Pattern
 * This is an abstract class of PumpGasUnit event
 */
public abstract class PumpGasUnit {
	public Data data;
	
	public PumpGasUnit(Data data) {
		this.data = data;
	}
	public abstract void PumpGasUnit();
}
