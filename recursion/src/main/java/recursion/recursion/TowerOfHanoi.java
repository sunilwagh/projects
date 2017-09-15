package recursion.recursion;

public class TowerOfHanoi {
	
	public static void main(String[] args)
	{
		towerOfHanoi(3,"sourceTower","destinationTower","intermediateTower");
	}
	
	public static void towerOfHanoi(int numberOfDisks,String sourceTower,String destinationTower,String intermediateTower)
	{
		if (numberOfDisks == 1)
		{
			System.out.println("Push " + numberOfDisks +"from source tower to destination tower");
		}
		else
		{
		towerOfHanoi(numberOfDisks-1,sourceTower,intermediateTower,destinationTower);
		System.out.println("Push " + numberOfDisks +" from "+ sourceTower + " -> "+destinationTower);
		towerOfHanoi(numberOfDisks-1,intermediateTower,destinationTower,sourceTower);
		}
	}
}
