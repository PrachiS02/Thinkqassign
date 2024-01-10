package com.collectioncombineset;

import java.util.Arrays;
import java.util.HashSet;

public class SetToArray {

	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<>();
        
		hs.add(10);
        hs.add(1);
        hs.add(3);
        System.out.println(hs);
        System.out.println("=====================================================");
        
        Integer arr[]=new Integer[hs.size()];
        hs.toArray(arr);
        System.out.println(Arrays.toString(arr));
        
        
        }
	}


