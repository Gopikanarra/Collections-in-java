//enum stationary{
//	PEN,BOOK,PLANK;
//}
public class EnumDemo1 {

	public static void main(String[] args) {
		enum stationary{
			
			PEN(20) {
				void demo() {
					System.out.println("demo in pen of enum");
					
				}
			},BOOK(40) {
				void demo() {
					System.out.println("demo in book of enum");
					
				}
			},PLANK(30) {
				void demo() {
					System.out.println("demo in plank of enum");
					
				}
			};
			int price;
			stationary(int p) {
				price=p;
			}
			abstract void demo();
			
		}
		stationary var = stationary.valueOf("BOOK");
		System.out.println(var);
		var.demo();
		for(stationary var1:stationary.values()) {System.out.println(" i am lucky to have a "+var1.price+" rupees"+var1);}
		switch(var) {
		case PEN:System.out.println(" i am lucky to have a  rupees pen!!");
				  break;
		case BOOK:System.out.println("i am great enough to have a rupees book!!");
				   break;
		case PLANK:System.out.println("i have a good plank in my hands!! of cost");
					break;
		}

	}

	}

