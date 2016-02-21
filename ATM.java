
class ATM {
	String currency;
	int [] denom;
	int [] amountofnotes;
	
	public ATM(String curr, int[] d) {
		currency=curr;
		denom=d;
		amountofnotes = new int[denom.length];
	}
		
		public String toString() {
			for(i=0; i<denom.length;i++){
				return denom[i]+""+amountofnotes[i]
			}
			return "The currency of this atm is:"+"" +currency+""+
		}
		
		public void setCurrency(String c) {
		currency= c;	
		}
		
		public String getCurrency(){
			return currency;
		}
		public int getQty(int denoms){
			for(int i=0; i<denom.length; i++ ){
				if(denom[i]==denoms){
					return denoms[i];
				}
			}
		}
		public void load(int qty, int denoms){
			for(int i=0; i<denom.length; i++){
				if(denom[i]==denoms){
					amountofnotes[i]+=1;
				}
			}
			
		}
		
		public void dispense(int qty, int denoms){
			for(int i=0;i < denom.length; i++){
				if(denom[i]==notes && amountofnotes[i]>qty){
					amountofnotes[i]-= qty;
				}
			}
			
			
		}	
}

