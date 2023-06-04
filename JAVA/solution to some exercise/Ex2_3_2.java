package EX2;

import java.awt.Color;
import java.time.Clock;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex2_3_2 {

	public static void main(String[] args) {
		boolean c[][] = { { true, true, false, true },
			        	{ true, false, false, true }, 
				        { false, true, false, true },
				        { true, true, false, true } };

		gameoflife(24, 10);
	}

	public static void gameoflife(int n, int cellsize)  {
		 setboard(n, cellsize);
			boolean[][] cells = randomboolarray(n);
			drawcells(cells, cellsize, StdDraw.GREEN);
			while(deadOralive(cells)) {  
				cells = Ex2_3_1.nextGeneration(cells);
				drawcells(cells, cellsize, StdDraw.GREEN);

		}

	}

	
	   public static boolean deadOralive(boolean[][] cells) {
			boolean isAlive = false;
			for (int k3 = 0; k3 < cells.length; k3++) {
				for (int k4 = 0; k4 < cells.length; k4++) {
					if (Ex2_3_1.checkCell(cells, k3, k4)){
						isAlive = true;

					}
				}
			}
			return isAlive;
		}
	
	
	
	

	/**
	 * fill the boolean array(n*n) randomalit
	 * 
	 * @param n
	 * @return
	 */
	public static boolean[][] randomboolarray(int n) {
		Random rand = new Random();
		boolean[][] arr = new boolean[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextBoolean();
			}
		}
		return arr;
	}

	/**
	 * accept n to represent the length of cells array (n*n) accept cellsize to
	 * represent cell size prepare board to the accepted array accept color set pen
	 * color to the accepted color
	 * 
	 * @param n
	 * @param cellsize
	 */
	public static void setboard(int n, int cellsize) {
		StdDraw.setCanvasSize(cellsize * (2 * n), cellsize * (2 * n));
		StdDraw.setScale(0-5, n*cellsize-5);
		for (int i = 0; i <= n; i++) {
			StdDraw.line((i * cellsize) - 5, -5, (i * cellsize) - 5, (n * cellsize) - 5);// axis x
			StdDraw.line(-5, (i * cellsize) - 5, (n * cellsize) - 5, (i * cellsize) - 5);// axis y
		}
	}

	public static void drawcells(boolean[][] cells, int cellsize, Color color) {

		int n = cells.length;
		for (int k = 0; k < n; k++) {
			for (int k2 = 0; k2 < n; k2++) {
				if (Ex2_3_1.checkCell(cells, k, k2)) {
					StdDraw.setPenColor(color);
					StdDraw.filledSquare(k * cellsize, k2 * cellsize, cellsize / 2.15);

				} else {
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.filledSquare(k * cellsize, k2 * cellsize, cellsize / 2.15);

				}
			}
		}
		// StdDraw.clear();
	}
}


