
public class WorkerOfCompany {
	
	protected String name;
	protected String surname;
	public String moral;
	public String abilityInCollective;
	public String creativePotential;
	public String activity;
	public int salary;
	public String organization;
	public String education;
	public String professionalism;
	public int workingHours;

	 public void setName(String newName){
	        name = newName;
	    }
	    public String getName(){
	        return name;
		}
	    public void setSurname(String newSurname){
	        name = newSurname;
	    }
	    public String getSurname(){
	        return surname;
	    }

	public void setMoral(String newValue){
		
	    moral = newValue; 
	    }
	
    public void setAbilityinCollective(String newValue){
		
    	abilityInCollective = newValue; 
	    }
    	
    public void setCreativePotential(String newValue){
	
    	creativePotential = newValue; 
        }
    
     public void setActivity(String newValue){
		
    	 activity = newValue; 
	    }

     public void calculateSalary(int newValue){
	
    	 salary = newValue; 
        }

     public void setOrganization(String newValue){
	
    	 organization = newValue; 
        }
     
     public void setEducation(String newValue){
    	 
    	 education = newValue; 
     }
     
     public void setProfessionalism(String newValue){
    	 
    	 professionalism = newValue;
     }
     
     public void setWorkingHours(int newValue){
    	 
    	 workingHours = newValue;
     }
     
	
	
}
