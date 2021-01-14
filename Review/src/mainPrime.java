
public class mainPrime {

	  public static void main(String[] args) {
		    System.out.println("Hello Prime!");
		    
		    System.out.println(/*isPrime(2)*/);
		    System.out.println(/*isPrime(3)*/);
		    System.out.println(isPrime(4));
		    System.out.println(isPrime(10));
		    System.out.println(/*isPrime(11)*/);
		    System.out.println(isPrime(13));
		}
		//isPrime goes here
		public static boolean isPrime(int a) {
			//boolean prime=true;
			for(int i=2; i<=a/2;i++) {
				if(a%i==0) {
					//prime=false;
					//break;
					return false;
				}
				
			}
			return true;
		}
		


}
