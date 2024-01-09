package labassignment;

 class Pen 
 {
   private Refill refill;
   private int capLength;
   private String brand;
  
   
   Pen()
   {
	   
   }


	public Pen(Refill refill, int capLength, String brand) {
		super();
		this.refill = refill;
		this.capLength = capLength;
		this.brand = brand;
	}


	public Refill getRefill() {
		return refill;
	}


	public void setRefill(Refill refill) {
		this.refill = refill;
	}


	public int getCapLength() {
		return capLength;
	}


	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Pen [refill=" + refill + ", capLength=" + capLength + ", brand=" + brand + "]";
	}
	
   
 }   