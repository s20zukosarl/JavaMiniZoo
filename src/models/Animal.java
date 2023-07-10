package models;

public class Animal {

	private int id;
	private static int idCounter = 0;
	private String title;
	protected String animalCode;
	private String food;
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAnimalCode() {
		return animalCode;
	}
	public String getFood() {
		return food;
	}
	
	// set
	
	public void setId() {
		this.id = idCounter;
		idCounter++;
	}
	
	public void setTitle(String title) {
		
		if(title != null && title.matches("[A-ZÂÇÛÎÏÍÌĞŞÈÒ]{1}[a-zçûîâğìíïòèş]+"))
		{
			this.title = title;
		}
		else
		{
			this.title = "unknown";
		}
	}
	
	public void setFood(String food) {
		
		if (food != null && food.matches("[a-zçûîâğìíïòèş]+"))
		{
			this.food = food;
		}
		else
		{
			this.food = "unknown";
		}
	}
	
	public Animal()
	{
		setId();
		setTitle("Test");
		setFood("food");
	}
	
	public Animal(String title, String food)
	{
		setId();
		setTitle(title);
		setFood(food);
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", title=" + title + ", food=" + food + "]";
	}
	
	
	
	
	
	

}
