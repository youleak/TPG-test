package test.question3;

public class Main {

	public static void main(String[] args) {
		//Display time consumed by calling Main().thisIsALongRunningMethod()
		TimeCount.printTime(() -> new Main().thisIsALongRunningMethod());
	}
	
	 public String thisIsALongRunningMethod() {
		 System.out.println("thisIsALongRunningMethod start call.");
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         System.out.println("thisIsALongRunningMethod stop called.");
         return null;
     }
}
