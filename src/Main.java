
public class Main {

	public static void main(String[] args) {

		
		String[] dish = {"Sandwich", "Coffee", "French fries", "Salad"};
		double[] cost ={6.5, 3.2, 4.0, 3.5};
		
		Bill myBill = new Bill();
		
		myBill.addOrder("Sandwich", 2, dish, cost);
		myBill.addOrder("Coffee", 2, dish, cost);
		myBill.addOrder("French fries", 1, dish, cost);
		myBill.addOrder("Salad", 1, dish, cost);
		
		myBill.getOrder();
		
		System.out.println(myBill.getTotal());
		
	}

}
