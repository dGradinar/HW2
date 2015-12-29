
public class Employee extends WorkerOfCompany {

	private String yearBonus;
	
	public Employee(String n, String l, String y) {
		
		name = n;
		surname = l;
		yearBonus = y;
		}
	
	public void setYearBonus(String newYearBonus){
		
		yearBonus = newYearBonus;
		
	}


}
