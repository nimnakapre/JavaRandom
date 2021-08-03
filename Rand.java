import java.util.Random;
class Rand {
    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 100,i = 1;
	  
      for(i=1;i<=5;i++){
		int int_random = rand.nextInt(upperbound);
		if (int_random >= 50){
			System.out.println(int_random + " : " + "High");
		}
		else
		{
			System.out.println(int_random + " : " + "Low");
		}
		
	  }  


     }
}