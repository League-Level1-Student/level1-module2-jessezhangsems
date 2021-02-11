package _06_tea_party;


	public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
			if (!isKnighted&&!isWoman) {
			return "Hello Mr. "+name;
			return "Hello Mrs. "+name;
			}
	    	return name;
	        
	    }
	    
	}
	

