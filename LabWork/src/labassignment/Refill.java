package labassignment;

 class Refill
{
  private String inkclr;
  private int length;
  private Nib nib;
  
  Refill()
  {
	  
  }

	public Refill(String inkclr, int length, Nib nib) {

		this.inkclr = inkclr;
		this.length = length;
		this.nib = nib;
	}

	public String getInkclr() {
		return inkclr;
	}

	public void setInkclr(String inkclr) {
		this.inkclr = inkclr;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	@Override
	public String toString() {
		return "Refill [inkclr=" + inkclr + ", length=" + length + ", Nib=" + nib + "]";
	}
	
  
}
