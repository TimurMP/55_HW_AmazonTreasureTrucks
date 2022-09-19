package com.amazon.treasuretruck.service;

import java.util.ArrayList;
import java.util.List;

public class Solution {




	public int numberAmazonTreasureTrucks(int rows, int column, List<List<Integer>> grid) {
		pathFinder(grid);





//		boolean marker = false;


//
//		for (int i = 0; i < grid.size(); i++) {
//			if (i==0){
//				for (int j = 0; j < grid.get(i).size(); j++) {
//					 if (grid.get(i).get(j).equals(1)){
//						 marker = true;
//					 }
//
//				}
//			}
//
//
//		}
		// TODO
		return 0;
	}


	public static void pathFinder (List<List<Integer>> grid){
		int totalCells = grid.size()*grid.get(0).size();
		boolean[] visited = new boolean[totalCells];


		List<Integer> adj = new ArrayList<>();
		while (areConnected(grid)){


		}







//		LinkedList<Integer> queue = new LinkedList<>();
//		for (int i = 0; i < grid.size(); i++) {
//			for (int j = 0; j < grid.get(i).size(); j++) {
//				if (grid.get(i).get(j) == 1){
//					queue.add()
//
//				}
//
//				queue.add(grid.get(i).get(j));
//				queue.add(grid.get(i).get(j+1));
//				queue.add(grid.get(i+1).get(j));
//
//			}
//
//		}

	}

	private static boolean nextIsOne(List<List<Integer>> grid) {
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid.get(i).size(); j++) {
				if (grid.get(i).get(j)!=0) {
					int left = grid.get(i).get(j-1);
				}
				if (grid.get(i).get(j)!= grid.get(0).size()) {
					int right = grid.get(i).get(j+1);
				}
				if (i != 0) {
					int up = grid.get(i-1).get(j);
				}
				if (i != grid.size()-1) {
					int down = grid.get(i+1).get(j);
				}

				if (grid.get(i).get(j) == 1){
					grid.get(i).set(j, 5);
				}

				}


			}




		return false;
	}


}
