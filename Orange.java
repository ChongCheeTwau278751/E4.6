package Exe4_6;

public class Orange extends Fruit {

	private String brand;
	private double mass;
	protected int price;
	protected int quantity;
	    
	    public Orange(String name, String size, String brand, double mass, int price, int quantity){ 		
	       super(name, size);  										
	       this.brand = brand;
	       this.mass = mass;
	       this.price = price;
	       this.quantity = quantity;
	       
	       if(this.quantity == 1) {
	      	   		System.out.printf("Total Price(purchased) \t= RM%.2f", total());
	         	}else if(this.quantity == 12) {
	         		System.out.printf("Total Price(packet) \t= RM%.2f", total(11.50));
	         	}else if(this.quantity == 36) {
	         		DiscountRate op = new OrangeDiscount();
	         		double odis = op.discountRate();
	         		System.out.printf("Total Price(box) \t= RM%.2f", total(11.50,odis));
	         	}
	     }
	    //overriding method
	    public void printData(){ 
	    	System.out.println("Size \t\t\t= " + super.getSize());
	    }
	  	
	  	public String brand(){
	      return this.brand;
	    }
	  	//overloading without parameter
	  	public double mass(){
		   return this.mass;
		}
	  	
	  	//overloading with 1 parameter
	  	public double mass(int quantity){
			   return this.mass*quantity;
		}
	  	
	  	//overloading with 2 parameters
	  	public double mass(int quantity, double mass){
			   return mass*quantity;
		}
	  	
	  //Overloading (no parameter)
	    public double total(){
		    return this.price*this.quantity;
	   }
	    
	    //Overloading (1 parameter)
	    public double total(double oprice2){
		    return this.quantity*oprice2;
	   }
	    
	    //Overloading (2 parameters)
	    public double total(double oprice3, double odis){
	   	    return (oprice3*this.quantity)*(1-odis);
	   }
	  	
	  	//method toString as an overriding method(Fruit class)
	  	public String toString() {									
	  	  return  "\nBrand \t\t\t= " + brand() +
	  			  "\nMass(per piece) \t= " + mass + " kg" +
	  			  "\nPrice \t\t\t= " + price +
	  			  "\nQuantity \t\t= " + quantity;

	  	}
		
}
