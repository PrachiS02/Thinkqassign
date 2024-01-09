package labassignment;

 class Nib 
{
   private String materailtype;
   private int width;
   
   Nib()
   {
	   
   }

	public Nib(String materailtype, int width) 
	{
		
		this.materailtype = materailtype;
		this.width = width;
	}

	public String getMaterailtype() {
		return materailtype;
	}

	public void setMaterailtype(String materailtype) {
		this.materailtype = materailtype;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Nib [materailtype=" + materailtype + ", width=" + width + "]";
	}
    
}
