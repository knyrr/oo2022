import java.util.*;

public class Laud{
	boolean kasTyhi=false;
	int[][] laud = new int[10][10];
	
	public void maaraLaevaRuut(int x, int y){
		laud[x][y]=1;
	}
	
	public void maaraKorvalRuut(int x, int y){
		laud[x][y]=2;
	}
	
	public boolean kasTyhi(int x, int y){
		if(laud[x][y]==1){
			kasTyhi=false;
		} else {
			kasTyhi=true;
		}
		return kasTyhi;
	}
	
	public String toString(){
		StringBuffer result = new StringBuffer();
		result.append('\n');
		for (int i = 0; i < laud.length; ++i){
			for (int j = 0; j < laud[i].length; ++j){
				result.append(laud[i][j]+" ");
			}
			result.append('\n');
		}
		return result.toString();
	}
}