package models;

public class Zivs extends Animal{

	private boolean vaiIrZobi;
	private FishSize fishSize;
	
	public boolean isVaiIrZobi() {
		return vaiIrZobi;
	}
	public FishSize getFishSize() {
		return fishSize;
	}
	//set
	
	public void setVaiIrZobi(boolean vaiIrZobi) {
		
		
		this.vaiIrZobi = vaiIrZobi;
		
	}
	
	public void setFishSize(FishSize fishSize) {
		if (fishSize != null)
		{
			this.fishSize = fishSize;
		}
		else
		{
			this.fishSize = fishSize.OTHER;
		}
	}
	
	public Zivs()
	{
		super();
		setVaiIrZobi(true);
		setFishSize(fishSize.OTHER);
	}
	
	public Zivs (String title, String food, boolean vaiIrZobi, FishSize fishSize)
	{
		super();
		setVaiIrZobi(vaiIrZobi);
		setFishSize(fishSize);
	}
	
	@Override
	public String toString() {
		return "Zivs" + super.toString() +  "Vai Ir Zobi= " + vaiIrZobi + ", fish Size=" + fishSize;
	}
	
	
	
	
	
	
}
