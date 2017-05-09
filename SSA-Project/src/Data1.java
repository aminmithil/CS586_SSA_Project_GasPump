/*
 * This class is used to store and get the data related to GasPump1
 */
public class Data1 extends Data{

	private float Rprice;
	private float Sprice;
	private float price;
	private float total;
	private int G;
	
	//temp variables
	private float temp_a;
	private float temp_b;
	
	//return Rprice
	public float getRprice() {
		return Rprice;
	}
	//set Rprice
	public void setRprice(float rprice) {
		Rprice = rprice;
	}
	//return Sprice
	public float getSprice() {
		return Sprice;
	}
	//set Sprice
	public void setSprice(float sprice) {
		Sprice = sprice;
	}
	//return price
	public float getPrice() {
		return price;
	}
	//set price
	public void setPrice(float price) {
		this.price = price;
	}
	//return total
	public float getTotal() {
		return total;
	}
	//set total
	public void setTotal(float total) {
		this.total = total;
	}
	//return G
	public int getG() {
		return G;
	}
	//set G
	public void setG(int g) {
		this.G = g;
	}
	//return temp_a
	public float getTemp_a() {
		return temp_a;
	}
	//set temp_a
	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}
	//return temp_b
	public float getTemp_b() {
		return temp_b;
	}
	//set temp_b
	public void setTemp_b(float temp_b) {
		this.temp_b = temp_b;
	}
}
