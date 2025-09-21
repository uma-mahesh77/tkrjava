package interfacetointerface;


	public interface childinterface extends ParentInterface {
		void display();  // Additional abstract method

	    // Static method to produce output
	    static void showChildMessage() {
	        System.out.println("Hello from Child Interface!");
	    }
	}

