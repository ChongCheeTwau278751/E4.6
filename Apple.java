package Exe4_6;

public class Apple extends Fruit {

	protected int price;
	protected int quantity;
	private double mass;
    
    public Apple(String name, String size, int price, int quantity, double mass){		
       super(name,size);  											
       this.price = price;											
       this.quantity = quantity;		
       this.mass = mass;
       
       tPrice atprc = new AppleTotalPrice();
       tPrice ktprc = new KiwiTotalPrice();
       tPrice otprc = new OrangeTotalPrice();
       
       if (this.quantity<12) {
			System.out.printf("Total Price(purchased) \t= RM%.2f", total());
		}
       
       else if (this.quantity>=12 && this.quantity<=36) {
			if(name == "Apple" || name == "Green Apple" || name == "Red Apple") {
				System.out.printf("Total Price(box) \t= RM%.2f", atprc.totalPrice(this.quantity));
			}
			else if (name == "Kiwi") {
				System.out.printf("Total Price(box) \t= RM%.2f", ktprc.totalPrice(this.quantity));
			}
			else if (name == "Orange") {
				System.out.printf("Total Price(box) \t= RM%.2f", otprc.totalPrice(this.quantity));
			}
		}
       else {
			if(name == "Apple" || name == "Green Apple" || name == "Red Apple") {
				DiscountRate ap = new AppleDiscount();
				double adis = ap.discountRate(); //adis = apple discount
				System.out.printf("Total Price(box) \t=  RM%.2f", atprc.totalPrice(this.quantity, adis));
			}
			else if (name == "Kiwi") {
				DiscountRate kp = new KiwiDiscount();
				double kdis = kp.discountRate(); //kdis = kiwi discount
				System.out.printf("Total Price(box) \t= RM%.2f", ktprc.totalPrice(this.quantity, kdis));
			}
			else if (name == "Orange") {
				DiscountRate op = new OrangeDiscount();
				double odis = op.discountRate(); //odis = orange discount
				System.out.printf("Total Price(box) \t= RM%.2f", otprc.totalPrice(this.quantity,odis));
			}
       	}
     }
    //Overriding method
    public void printData(){ 
        System.out.println("Size \t\t\t= " + super.getSize());
    }
    
     public int getPrice(){
  	    return price;
  	}
     
     public int getQuantity(){
   	    return quantity;
   	} 	
     
    public double getMass(){
    	    return mass;
    } 
    //Overloading without parameter
   	public double mass(){
         return this.mass;
    }
     
     //Overloading without parameter
     public double total(){
 	    return this.price*this.quantity;
    }
     
    //method toString as an overriding method(fruit class)
  	public String toString() { 
  	  return "\nPrice(per piece) \t= RM" + price + 
  			 "\nQuantity \t\t= " + quantity +
  			 "\nMass \t\t\t= " + mass + " kg";
  	}
}
