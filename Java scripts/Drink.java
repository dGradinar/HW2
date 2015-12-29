
public class Drink extends CustomerGoods {
	
	private String stock; 
	
	public Drink(String t, int s, String c, int p){
		
		trademark = t;
		size = s;
		countryVendor = c;
		price = p; 
	}
	
	public void setStock (String newStock){
		
		stock = newStock;
	}

}
