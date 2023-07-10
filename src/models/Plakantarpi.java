package models;

public class Plakantarpi extends Animal {

	private int cikSkropstinuGarums;
	private String livingRequirements;
	
	public int getCikSkropstinuGarums() {
		return cikSkropstinuGarums;
	}
	public String getLivingRequirements() {
		return livingRequirements;
	}
	
	public void setCikSkropstinuGarums(int cikSkropstinuGarums) {
		
		if (cikSkropstinuGarums != 0 && cikSkropstinuGarums > 0 && cikSkropstinuGarums <= 20)
		{
			this.cikSkropstinuGarums = cikSkropstinuGarums;
		}
		else
		{
			this.cikSkropstinuGarums = 0;
		}
	}
	public void setLivingRequirements(String livingRequirements) {
		
		if (livingRequirements != null && livingRequirements.matches("[a-zçûîâðìíïòèþ]+"))
		{
			this.livingRequirements = livingRequirements;
		}
		else
		{
			this.livingRequirements = "unknown";
		}
	}
	
	public Plakantarpi()
	{
		super();
		setCikSkropstinuGarums(1);
		setLivingRequirements("test");
	}
	
	public Plakantarpi(String title, String food, int cikSkropstinuGarums, String livingRequirements)
	{
		super();
		setCikSkropstinuGarums(cikSkropstinuGarums);
		setLivingRequirements(livingRequirements);
	}
	
	@Override
	public String toString() {
		return "Plakantarpi: " + super.toString()+  "cik Skropstinu Garums " + cikSkropstinuGarums + " living Requirements " + livingRequirements;
	}
	
	
	
	
}
