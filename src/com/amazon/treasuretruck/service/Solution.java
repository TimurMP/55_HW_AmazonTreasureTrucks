package com.amazon.treasuretruck.service;

import java.util.ArrayList;
import java.util.List;

public class Solution {




	public int numberAmazonTreasureTrucks(int rows, int column, List<List<Integer>> grid) {
		int total = 0;
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid.get(i).size(); j++) {
				if (grid.get(i).get(j) == 1){
					traverse(i, j);



				}

			}
		}








//		pathFinder(grid);
//		boolean marker = false;//
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

	private void traverse(int i, int j) {




	}


	public static void pathFinder (List<List<Integer>> grid){
		int totalCells = grid.size()*grid.get(0).size();
		boolean[] visited = new boolean[totalCells];


		List<Integer> adj = new ArrayList<>();
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

//	}






	private static List<List<Integer>> returnNeighbors(int i, int j, int rows, int columns) {




			List<List<Integer>> cells = new ArrayList<>();
			List<Integer> left = new ArrayList<>();
			left.add(i);
			left.add(j-1);
			cells.add(left);

			List<Integer> right = new ArrayList<>();
			left.add(i);
			left.add(j+1);
			cells.add(right);

			List<Integer> top = new ArrayList<>();
			left.add(i-1);
			left.add(j);
			cells.add(top);

			List<Integer> down = new ArrayList<>();
			left.add(i+1);
			left.add(j);
			cells.add(down);





//			cells.get(i).add(j-1); //left
//			cells.get(i).add(j+1); //right
//			cells.get(i-1).add(j); //top
//			cells.get(i+1).add(j); //down
//




//			if (j!=0) {
//				int left = grid.get(i).get(j-1);
//
//			}
//			if (j!= grid.get(j).size()-1) {
//				int right = grid.get(i).get(j+1);
//			}
//			if (i != 0) {
//				int up = grid.get(i-1).get(j);
//			}
//			if (i != grid.size()-1) {
//				int down = grid.get(i+1).get(j);
//			}





//	private static Integer[] returnNeighbors(List<List<Integer>> grid, int ii, int jj) {
//		for (int i = 0; i < grid.size(); i++) {
//			for (int j = 0; j < grid.get(i).size(); j++) {
//				if (j!=0) {
//					int left = grid.get(i).get(j-1);
//				}
//				if (j!= grid.get(j).size()-1) {
//					int right = grid.get(i).get(j+1);
//				}
//				if (i != 0) {
//					int up = grid.get(i-1).get(j);
//				}
//				if (i != grid.size()-1) {
//					int down = grid.get(i+1).get(j);
//				}
//				}
//			}




	}


}
