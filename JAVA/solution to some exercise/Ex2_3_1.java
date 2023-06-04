package EX2;

import java.util.Arrays;

public class Ex2_3_1 {

	public static boolean[][] nextGeneration(boolean[][] cells) {
		boolean[][] nextGeneration = new boolean[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				if (!checkCell(cells, i, j)) {
					if (numberOfNeighbors(cells, i, j) == 3) {
						nextGeneration[i][j] = true;
					}
				} else if (checkCell(cells, i, j)) {
					if (numberOfNeighbors(cells, i, j) == 2 || numberOfNeighbors(cells, i, j) == 3) {
						nextGeneration[i][j] = true;

					} else {
						nextGeneration[i][j] = false;

					}
				}
			}
		}
return nextGeneration;
	}
		
	public static boolean isInside(boolean[][] cells, int x, int y) {
    if((0<=x)&&(x<cells.length-1)&&(0<=y)&&(y<cells[0].length-1)) {
    	return true;
    }
    return false;
  }
	
public static boolean checkCell(boolean[][] cells, int x, int y) {
//	if(isInside(cells, x, y)) {
	return cells[x][y];  
	
	//}
	
	//else return checkCell(cells,x,y);
}

public static int numberOfNeighbors(boolean[][] cells,int x,int y) {
	int counter = 0;
	for (int i = x-1; i <= x+1; i++) {
	if(i>=0 && i<cells.length) {
	for (int j = y-1; j <cells[i].length-1; j++) {
		if(j>=0 && j<=y+1 ) {
			if(i!=x || j!=y) {
				if(checkCell(cells, i, j)) //if the value in the cells is,
	    	//true it will get in and add counter +1 (with help function) if false step out,
	    	//and not add counter +1
        {
        	counter++;
		
                  }
                 }
	          }
            }
	     }
	}	

return counter;
}

	
public static void main(String[] args) {
		
boolean c[][]= {{true,true,false,true,false,false,false,true,true,false},
               {true,true,false,true,false,false,false,true,true,false},
               {false,true,false,true,false,false,false,true,true,false},
               {true,true,false,true,false,false,false,true,true,false}};


System.out.println(numberOfNeighbors(c, 0,0));	
	
    }
}

