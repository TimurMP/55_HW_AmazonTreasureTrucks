package com.amazon.treasuretruck.service;

import java.util.List;

public class Solution {




	public int numberAmazonTreasureTrucks(int rows, int column, List<List<Integer>> grid) {
		boolean marker = false;



		for (int i = 0; i < grid.size(); i++) {
			if (i==0){
				for (int j = 0; j < grid.get(i).size(); j++) {
					 if (grid.get(i).get(j).equals(1)){
						 marker = true;
					 }

				}
			}


		}
		// TODO
		return 0;
	}





}
