import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
	
	public static void main(String args[]) {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1 : Gas Pump 1");
		System.out.println("2 : Gas Pump 2");
		System.out.println("Select Gas Pump : ");
		
		int pumpType;
		String userInput = "start";
		
		try {
			pumpType = Integer.parseInt(scan.readLine());
			switch(pumpType) {
				case 1: //Gas Pump-1 Selected
						ConcreteFactory1 concreteFactory1 = new ConcreteFactory1(); 
						GasPump1 gasPump1 = new GasPump1(concreteFactory1);
					
						while(!userInput.equals("q")) {
							gasPump1.displayMenu(); // display menu of gas pump-1
							userInput = scan.readLine(); //get input from the user
							
							switch(userInput) {
								case "0" :
											System.out.println("Activate method");
											System.out.println("Enter the Value of a : ");
											float a = Float.parseFloat(scan.readLine());
											System.out.println("Enter the Value of b : ");
											float b = Float.parseFloat(scan.readLine());
											gasPump1.Activate(a, b);
											break;
										
								case "1" :
											System.out.println("Start method");
											gasPump1.Start();
											break;
									
								case "2" :
											System.out.println("Pay Credit");
											gasPump1.PayCredit();
											break;
									
								case "3" :
											System.out.println("Approved");
											gasPump1.Approved();
											break;
									
								case "4" :
											System.out.println("Reject");
											gasPump1.Reject();
											break;
									
								case "5" :
											System.out.println("Cancel");
											gasPump1.Cancel();
											break;
									
								case "6" :
											System.out.println("Regular Gas");
											gasPump1.Regular();
											break;
									
								case "7" :
											System.out.println("Super Gas");
											gasPump1.Super();
											break;
									
								case "8" :
											System.out.println("StartPump");
											gasPump1.StartPump();
											break;
									
								case "9" :
											System.out.println("PumpGallon");
											gasPump1.PumpGallon();
											break;
									
								case "10" :
											System.out.println("StopPump");
											gasPump1.StopPump();
											break;
									
								case "q" :
											System.out.println("Quit");
											System.exit(0);
											break;
										
								default :
											System.out.println("Wrong Choise");
											break;
							}
						}
						break;
						
				case 2: //gas pump-2 selected
						ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
						GasPump2 gasPump2 = new GasPump2(concreteFactory2);
					
						while(!userInput.equals("q")) {
							gasPump2.displayMenu(); //display menu of gas pump-2
							userInput = scan.readLine(); //get input from the user
							
							switch(userInput) {
								case "0" :
											System.out.println("Activate method");
											System.out.println("Enter the Value of a : ");
											int a = Integer.parseInt(scan.readLine());
											System.out.println("Enter the Value of b : ");
											int b = Integer.parseInt(scan.readLine());
											System.out.println("Enter the Value of c : ");
											int c = Integer.parseInt(scan.readLine());
											gasPump2.Activate(a, b, c);
											break;
										
								case "1" :
											System.out.println("Start method");
											gasPump2.Start();
											break;
									
								case "2" :
											System.out.println("Pay Cash");
											System.out.println("Enter your cash : ");
											int cash = Integer.parseInt(scan.readLine());
											gasPump2.PayCash(cash);
											break;
									
								case "3" :
											System.out.println("Cancel");
											gasPump2.Cancel();
											break;
									
								case "4" :
											System.out.println("Premium Gas");
											gasPump2.Premium();
											break;
									
								case "5" :
											System.out.println("Regular Gas");
											gasPump2.Regular();
											break;
									
								case "6" :
											System.out.println("Super Gas");
											gasPump2.Super();
											break;
									
								case "7" :
											System.out.println("Start Pump");
											gasPump2.StartPump();
											break;
									
								case "8" :
											System.out.println("Pump Liter");
											gasPump2.PumpLiter();
											break;
									
								case "9" :
											System.out.println("Stop Pump");
											gasPump2.Stop();
											break;
									
								case "10" :
											System.out.println("Receipt");
											gasPump2.Receipt();
											break;
											
								case "11" :
											System.out.println("No Receipt");
											gasPump2.NoReceipt();
											break;
									
								case "q" :
											System.out.println("Exit");
											System.exit(0);
											break;
										
								default :
											System.out.println("Wrong Choise");
											break;
							}
						}
						break;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Number should be in proper");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Input IO error");
			System.exit(1);
		}
	}
}
