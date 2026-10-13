package HelloWorld;

public class OverRidding {


		// class and object
		// variable method constructor and block
		class Parent {
			void property() {
				System.out.println("Property");
			}
			void marry() {
				System.out.println("family selection");
			}
		}
		class Demo extends Parent {
			void marry() {
				System.out.println(" campus selection");
			}
		}
			public static void main(String[] args) {
				OverRidding obj = new OverRidding();
				Demo bb = obj.new Demo();
		    bb.marry();
		    bb.property();
		    
			}
}
		
	
	


