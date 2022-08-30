import java.util.HashMap;
public class ATM {
	private HashMap<Integer, Double> FullAtm; 
	
	public ATM()
	{
		FullAtm = new HashMap<Integer, Double>(); 
	}

	public void openAccount (int accountNumber)
	{
		FullAtm.put(accountNumber, (double) 0);
	}
	
	public void openAccount (int accountNumber, double initialDeposit)
	{
		FullAtm.put(accountNumber, initialDeposit);
	}
	
	public void closeAccount (int accountNumber)
	{
		if (FullAtm.get(accountNumber) == 0.0)
		{
			FullAtm.remove(accountNumber);
		}
	}
	
	public double checkBalance (int accountNumber)
	{
		if (!FullAtm.containsKey(accountNumber))
		{
			return (0.0);
		}
		return (FullAtm.get(accountNumber)); 
	}
	
	public boolean depositMoney (int accountNumber, double deposit)
	{
		if (!FullAtm.containsKey(accountNumber))
		{
			return false;
		}
		double total = FullAtm.get(accountNumber) + deposit;
		FullAtm.replace(accountNumber, total); 
		return true; 
		
	}
	
	public boolean withdrawMoney (int accountNumber, double withdrawl)
	{
		if (!FullAtm.containsKey(accountNumber))
		{
			return false;
		}
		double total = FullAtm.get(accountNumber) - withdrawl;
		FullAtm.replace(accountNumber, total); 
		return true; 
	}
}
