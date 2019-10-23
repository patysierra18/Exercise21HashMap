package com.exercise21hashmap.app;
import java.util.HashMap;
import java.util.Map;

public class HashMapApp 
{

	public static void main(String[] args)
	{
		HashMap<Integer, String> miHash = new HashMap<Integer, String>();
		miHash.put(1,"Ary");
		miHash.put(2,"Cristina");
		miHash.put(2,"Alex");
		
		for(int i=0;i<=miHash.size();i++)
		{
			if(miHash.containsKey(i))
			{
				System.out.println(miHash.get(i));
			}
		}
		for(Map.Entry<Integer,String> miMap : miHash.entrySet())
		{
			System.out.println(String.format("The key is: %d, value %s",
					miMap.getKey() , miMap.getValue()));
		}
	}

}
