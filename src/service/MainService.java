package service;

import java.time.LocalDate;
import java.util.ArrayList;

import models.Animal;
import models.FeedProduct;
import models.FishSize;
import models.Plakantarpi;
import models.Zivs;


public class MainService {
	
	
	private static ArrayList<Animal> allAnimals = new ArrayList<>();
	private static ArrayList<FeedProduct> allFeedProducts = new ArrayList<>();
	

	public static void main(String[] args) {


		Zivs z1 = new Zivs("Forele", "burkâni", true, FishSize.AVERAGE);
		Zivs z2 = new Zivs("Haizivs", "zivis", true, FishSize.BIG);
		Zivs z3 = new Zivs("Bute", "barîba", true, FishSize.AVERAGE);
		
		allAnimals.add(z1);
		allAnimals.add(z2);
		allAnimals.add(z3);
		
		Plakantarpi p1 = new Plakantarpi("Tarps", "barîba", 5, "mâjâ");
		Plakantarpi p2 = new Plakantarpi("Tarpins", "food", 3, "ârâ");
		Plakantarpi p3 = new Plakantarpi("Plakanais", "food", 6, "sauszemç");
		
		allAnimals.add(p1);
		allAnimals.add(p2);
		allAnimals.add(p3);
		
		FeedProduct fp1 = new FeedProduct("barîba", 50, LocalDate.of(2024, 3, 30));
		FeedProduct fp2 = new FeedProduct("pârtika", 20, LocalDate.of(2023, 3, 20));
		FeedProduct fp3 = new FeedProduct("food", 10, LocalDate.of(2022, 5, 30));
		
		allFeedProducts.add(fp1);
		allFeedProducts.add(fp2);
		allFeedProducts.add(fp3);
		
		

	}
	
	private static boolean createNewFish(String title, String food, boolean vaiIrZobi, FishSize fishSize)
	{
		Zivs zivs = new Zivs(title, food, vaiIrZobi, fishSize);
		
		if(allAnimals.contains(zivs))
		{
			return false;
		}
		else
		{
			allAnimals.add(zivs);
			return true;
		}
	}
	
	private static Zivs getAllZivis()
	{
		for (Animal temp : allAnimals)
		{
			if (temp instanceof Zivs)
			{
				
				return (Zivs) temp;
			}
		}
		return new Zivs();
	}
	
	private static Animal getZivsById(int id)
	{
		if (id > 0 && id < 100)
		{
			for (Animal temp : allAnimals)
			{
				if (temp instanceof Zivs && temp.getId() == id)
				{
					return temp;
				}
			}
		}
		return new Zivs();
	}
	
	private static boolean updateZivsById(int id, String title, String food, boolean vaiIrZobi, FishSize fishSize)
	{
		if (id > 0 && id < 100)
		{
			for (Animal temp : allAnimals)
			{
				if ( temp instanceof Zivs && allAnimals.contains(temp) && temp.getId() == id)
				{
					temp.setTitle(title);
					temp.setFood(food);
					((Zivs) temp).setVaiIrZobi(vaiIrZobi);
					((Zivs) temp).setFishSize(fishSize);
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean deleteZivsById(int id)
	{
		if (id > 0 && id < 100)
		{
			for (Animal zivs : allAnimals)
			{
				if(zivs.getId() == id)
				{
					allAnimals.remove(zivs);
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean isPossibleToFeedAllPlakantarpi()
	{
		int sum = 0;
		int baribaVienamPlakantarpam = 10;
		int plakantarpuCount = 0;
		
		for (Animal tarps : allAnimals)
		{
			if (tarps instanceof Plakantarpi)
			{
				plakantarpuCount ++;
			}
				
		}
		
		for (FeedProduct temp : allFeedProducts)
		{
			if (temp.getQuantity() > 0)
			{
				sum += temp.getQuantity();
			}
		}
		
		if (sum >= baribaVienamPlakantarpam * plakantarpuCount)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static int howManyFoodUnitsForPlakantarpi(Plakantarpi tarps)
	{
		String kadaPartika = tarps.getFood();
		int cikDaudz = 0;
		for (FeedProduct food : allFeedProducts)
		{
			if (allFeedProducts.contains(kadaPartika))
			{
				int f;
				f = food.getQuantity();
				cikDaudz +=f;
			}
		}
		return cikDaudz;
	}

}
