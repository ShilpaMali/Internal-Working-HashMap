package com.velocity.hashmap;

import java.util.HashMap;

public class HashSetDemo2 {
	public static void main(String[] args) {

		HashMap hm = new HashMap(); //16*0.75=12th element
		hm.put(10, "pune"); //index value as 3
		hm.put(15, "mumbai"); //index value as 8 
		hm.put(20, "bangalore"); //index value as 12
		hm.put(25, "delhi"); //index value as 8
		System.out.println(hm);
	}

}
