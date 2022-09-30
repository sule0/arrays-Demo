
public class Main {

	public static void main(String[] args) {
		
		  double[] numbersList = {3.4,6.2,1.3,0.5};
		    double total=0;
		    double max=numbersList[0];
		    
		    for(double number: numbersList) {
		    	if(max<number) {
		    		max=number;
		    	}
		    	total+=number;
		    	
		    }
		    
		    System.out.println("total:  "+total);
		    System.out.print("max number:  "+max);
		    }
	

}
