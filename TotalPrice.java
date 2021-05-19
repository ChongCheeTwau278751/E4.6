package Exe4_6;

 class AppleTotalPrice implements tPrice {

	double aprc = 10.00;
	double aprc2 = 9.50;
	public double totalPrice(double q) {
		return aprc*q;
	}

	@Override
	public double totalPrice(double q, double d) {
		return (aprc2*q)*(1-d);
	}
 }
	class KiwiTotalPrice implements tPrice{

		double kprc = 17.00;
		double kprc2 = 16.50;
		public double totalPrice(double q) {
			return kprc*q;
		}

		public double totalPrice(double q, double d) {
			return (kprc2*q)*(1-d);
		}
	}
	
	class OrangeTotalPrice implements tPrice{

		double oprc = 12.00;
		double oprc2 = 11.50;
		public double totalPrice(double q) {
			return oprc*q;
		}

		public double totalPrice(double q, double d) {
			return (oprc2*q)*(1-d);
		}
	}

