package Switch;

public class FoodOrder {
	void orderFood(int choice) {
		switch(choice) {
		case 1:
			System.out.println("You ordered Pizza - 400");
			break;
		case 2:
			System.out.println("You ordered Burger - 200");
			break;
		case 3:
			System.out.println("You ordered Pasta - 250");
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder obj=new FoodOrder();
		obj.orderFood(1);
		obj.orderFood(2);
		obj.orderFood(3);
		obj.orderFood(4);
		obj.orderFood(5);
	}
}
