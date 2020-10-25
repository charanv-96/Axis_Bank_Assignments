package com.manipal.dp.behavioural.iterator;

public class FruitRepository implements Container {
	
	public String [] fruits = {"Banana", "Orange", "Mango", "Watermelon"};
	
	
	@Override
	public Iterator getIterator()
	{
		return new FruitIterator();
	}
	
	private class FruitIterator implements Iterator
	{
		
		int index;

		@Override
		public Boolean hasNext() {
			
			if(index < fruits.length)
				return true;
			return false;
			
		}

		@Override
		public Object next(){
			
			if(this.hasNext())
				return fruits[index++];
			return null;

		}
		
	}



}
