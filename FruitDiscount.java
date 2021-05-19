package Exe4_6;

 	class AppleDiscount implements DiscountRate { //FruitDiscount is a sub class for interface DiscountRate

		public double discountRate(){ // same method as in discount rate 
			return 0.05; // with body
		}	
	}

	class KiwiDiscount implements DiscountRate{ //WatermelonDiscount is a sub class for interface DiscountRate

		public double discountRate(){ // same method as in discount rate 
			return 0.10; // with body
		}
	}

	class OrangeDiscount implements DiscountRate{ //WatermelonDiscount is a sub class for interface DiscountRate

		public double discountRate(){ // same method as in discount rate 
			return 0.15; // with body
		}
	}
