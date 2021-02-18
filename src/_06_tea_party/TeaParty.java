package _06_tea_party;


	public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
			if (!isKnighted&&!isWoman) {
			return "Hello Mr. "+name;
			
			}
			if (isKnighted&&isWoman) {
				return "Hello Lady "+name;
			}
			if (isKnighted&&!isWoman) {
				return "Hello Sir "+name;
			}
			if(!isKnighted&&isWoman) {
				return "Hello Ms. "+name;
			}
	    	return name;
	        
	    }
	    
	}
	

