package com.manipal.dp.behavioural.iterator;

public class IteratorPatternDemo {
	
	public static void main(String []args)
	{
		
		FruitRepository fruitRepository = new FruitRepository();
		
		Iterator iter = fruitRepository.getIterator(); 
		
		while(iter.hasNext())
		{
			String fruit = (String) iter.next();
			System.out.println(fruit);
		}
	}
	


}
