package hackerRank.domains.algorithms.graphTheory.snakesAndLadders;

import java.util.Arrays;
import java.util.Scanner;

public class Snakes {

	final static int BOARD_SIZE = 100;
	final static int DICE_SIZE = 6;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();

		for (int i = 0; i < numCases; i++) {
			// Initialize the board
			int[] board = new int[BOARD_SIZE + 1];
			for (int j = 0; j < board.length; j++) {
				board[j] = j;
			}

			// Add the ladders to the board
			int numLadders = in.nextInt();
			for (int j = 0; j < numLadders; j++) {
				board[in.nextInt()] = in.nextInt();
			}

			// Add the snakes to the board
			int numSnakes = in.nextInt();
			for (int j = 0; j < numSnakes; j++) {
				board[in.nextInt()] = in.nextInt();
			}

			// Set the distance off all values to infinity(Integer max value)
			int[] dist = new int[BOARD_SIZE + 1];
			Arrays.fill(dist, Integer.MAX_VALUE);
			// Set the distance of the first square to 0
			dist[1] = 0;

			// Set all values to unvisited except 0 square since board shift
			boolean[] visited = new boolean[BOARD_SIZE + 1];
			visited[0] = true;

			// While the target square isn't visited
			while (!visited[BOARD_SIZE]) {
				// Find the tile with the lowest distance
				int minDist = Integer.MAX_VALUE;
				int minDistTile = -1;
				for (int j = 0; j < visited.length; j++) {
					if (!visited[j]) {
						if (dist[j] < minDist) {
							minDist = dist[j];
							minDistTile = j;
						}
					}
				}

				// If no tiles are found no path to target
				if (minDistTile == -1) {
					break;
				}

				// Take the current tile and set all neighbors to current dist+1
				for (int j = 1; j <= DICE_SIZE && minDistTile + j < BOARD_SIZE + 1; j++) {
					if (dist[board[minDistTile + j]] > dist[minDistTile] + 1) {
						dist[board[minDistTile + j]] = dist[minDistTile] + 1;
					}
				}
				// Set the current tile to visited
				visited[minDistTile] = true;
			}

			// If target was visited print distance else print -1
			if (visited[BOARD_SIZE]) {
				System.out.println(dist[BOARD_SIZE]);
			} else {
				System.out.println("-1");
			}
		}
	}
}