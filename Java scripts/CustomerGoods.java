
public class CustomerGoods {

	public String elements;
	public String goodsDetails;
	public String form;
	protected int size;
	protected String trademark;
	public String brand;
	protected String countryVendor;
	public int stability;
	protected int price;
	
	public void setElements(String newValue){
		
		elements = newValue;
		}

	public void setGoodsDetails(String newValue){
		
	    goodsDetails = newValue; 
	    }
	
    public void setForm(String newValue){
		
	    form = newValue; 
	    }
    	
    public void setSize(int newValue){
	
        size = newValue; 
        }
    
    public int getSize(){
 		
 	    return  size; 
 	     }
    
     public void setTrademark(String newTrademark){
		
	    trademark = newTrademark; 
	    }
    
     public String getTrademark(){
 		
 	    return  trademark; 
 	    
     }
     
     public void setBrand(String newValue){
	
        brand = newValue; 
        }

     public void setCountryVendor(String newValue){
	
        countryVendor = newValue; 
        }
     
     public String getCountryVendor(){
  		
  	    return countryVendor; 
  	    
      }
     
        public void setStability(int newValue){
    	 
    	 stability = newValue; 
     }
     
     public void setPrice(int newPrice){
    	 
    	 price = newPrice;
     }
     
     public int getPrice(){
   		
   	    return price; 
   	    
       }
    
     public void calculatePrice(int newValue){
    	 
    	 price = newValue;
     }
     

}