package com.arrays;

class CartItem {
	 int itemId;
	 String itemName;
	 double[] pricesFromSellers;
	public CartItem(int itemId,String itemName,double[] pricesFromSellers) {
		this.itemId=itemId;
		this.itemName=itemName;
		this.pricesFromSellers=pricesFromSellers;
	}
}
class ShoppingCart {
//	CartItem c1=new CartItem(1,"Shoes",new double[] {1500,1200,1000});
//	CartItem c2=new CartItem(2,"Dress",new double[] {2000,1800,1700});
//	CartItem c3=new CartItem(3,"Books",new double[] {500,100,120});
//	CartItem c4=new CartItem(4,"Bag",new double[] {1100,1200,1000});
//	CartItem c5=new CartItem(5,"Slipper",new double[] {1500,100,800});
//	CartItem[] cart=new CartItem[] {c1,c2,c3,c4,c5};
	CartItem[] cart;
	public ShoppingCart(CartItem[] cart) {
		this.cart=cart;
	}
	public double getMinCost(CartItem c) {
		return Math.min(c.pricesFromSellers[0],Math.min(c.pricesFromSellers[1], c.pricesFromSellers[2]));
	}
	public void displayCart() {
		for(CartItem c:cart) {
			System.out.println("Item Id :"+c.itemId);
			System.out.println("Item Name :"+c.itemName);
			System.out.println("Lowest price of this item is :"+getMinCost(c));
		}
	}
	public double calculateTotalCost() {
		double total=0;
		for(CartItem c:cart)
			total+=getMinCost(c);
		return total;
	}
	public static void main(String[] args) {
//		obj.displayCart();
//		obj.calculateTotalCost();
		CartItem c1=new CartItem(1,"Shoes",new double[] {1500,1200,1000});
		CartItem c2=new CartItem(2,"Dress",new double[] {2000,1800,1700});
		CartItem c3=new CartItem(3,"Books",new double[] {500,100,120});
		CartItem c4=new CartItem(4,"Bag",new double[] {1100,1200,1000});
		CartItem c5=new CartItem(5,"Slipper",new double[] {1500,100,800});
		CartItem[] cart=new CartItem[] {c1,c2,c3,c4,c5};
		ShoppingCart obj=new ShoppingCart(cart);
			obj.displayCart();
		System.out.println("Total Cost of the above item is : "+obj.calculateTotalCost());
	}
	
}
