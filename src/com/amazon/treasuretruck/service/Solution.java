package com.amazon.treasuretruck.service;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public int numberAmazonTreasureTrucks(int rows, int column, List<List<Integer>> grid) {
		int total = 0;
		for (int i = 0; i < grid.size(); i++) {
			for (int j = 0; j < grid.get(i).size(); j++) {
				if (grid.get(i).get(j) == 1){
					total++;
					traverse(i, j, rows, column,grid);

				}

			}
		}

		for (List<Integer> integers : grid) {
			System.out.println(integers);

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
		return total;
	}

	private void traverse(int i, int j, int rows, int column, List<List<Integer>> grid) {
		List<List<Integer>> neighbors = returnNeighbors(i, j, rows, column);
		grid.get(i).set(j, 5);
		for (int k = 0; k < neighbors.size(); k++) {
			for (int l = 0; l < neighbors.get(k).size(); l++) {
				if (grid.get(k).get(l) == 1){
//					grid.get(k).set(l, 5);
					traverse(k, l, rows, column,grid);
				}
			}
		}

//		traverse(i, j, rows, column,grid);



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
//					queue.add()//
//				}//
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
		left.add(j - 1);
		cells.add(left);

		List<Integer> right = new ArrayList<>();
		right.add(i);
		right.add(j + 1);
		cells.add(right);



		List<Integer> top = new ArrayList<>();
		top.add(i - 1);
		top.add(j);
		cells.add(top);

		List<Integer> down = new ArrayList<>();
		down.add(i + 1);
		down.add(j);
		cells.add(down);

		cells.removeIf(cell -> cell.get(0) < 0 || cell.get(0) >= columns || cell.get(1) < 0 || cell.get(1) >= rows);


		return cells;


	}

//			cells.get(i).add(j-1); //left
//			cells.get(i).add(j+1); //right
//			cells.get(i-1).add(j); //top
//			cells.get(i+1).add(j); //down

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
//	}


}
