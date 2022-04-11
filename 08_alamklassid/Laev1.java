import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Laev1 extends Laev{
	Ruut ruut1 = new Ruut();
	
	public Laev1(){
		ruudud.add(ruut1);
	}

	public void paigutaLaev(Laud laud){
		
		boolean onVaba = false;
		while(!onVaba){
			
 			x=ThreadLocalRandom.current().nextInt(0,10);
			y=ThreadLocalRandom.current().nextInt(0,10);
	
			/* üleval paremal */
			if(x==0&&y==0){
				if(laud.laud[x][y]==0&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1){
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x+1,y);
					laud.maaraKorvalRuut(x,y+1);
					laud.maaraKorvalRuut(x+1,y+1);
					onVaba=true;
					if(onVaba){
						break;
					}
				}
			}
			
			/* üleval keskel */
			if(x==0&&y>0&&y<9){
				if(laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1){
					laud.maaraKorvalRuut(x,y-1);
					laud.maaraKorvalRuut(x+1,y-1);
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x+1,y);
					laud.maaraKorvalRuut(x,y+1);
					laud.maaraKorvalRuut(x+1,y+1);
					onVaba=true;
					if(onVaba){
						break;
					}
				}
				
			}
			/* üleval vasakul */
			if(x==0&&y==9){
				if(laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1){
					laud.maaraKorvalRuut(x,y-1);
					laud.maaraKorvalRuut(x+1,y-1);
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x+1,y);				
					onVaba=true;
					if(onVaba){
						break;
					}
				}				
			}
			/* keskel paremal */
			if(x>0&&x<9&&y==0){
				if(laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1){
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x-1,y);
					laud.maaraKorvalRuut(x+1,y);
					laud.maaraKorvalRuut(x,y+1);
					laud.maaraKorvalRuut(x-1,y+1);
					laud.maaraKorvalRuut(x+1,y+1);
					onVaba=true;
					if(onVaba){
						break;
					}
				}				
			}
			/* keskel keskel */
			if(x>0&&x<9&&y>0&&y<9){
				if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1){
					laud.maaraKorvalRuut(x-1,y-1);
					laud.maaraKorvalRuut(x,y-1);
					laud.maaraKorvalRuut(x+1,y-1);
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x-1,y);
					laud.maaraKorvalRuut(x+1,y);
					laud.maaraKorvalRuut(x,y+1);
					laud.maaraKorvalRuut(x-1,y+1);
					laud.maaraKorvalRuut(x+1,y+1);
					onVaba=true;
					if(onVaba){
						break;
					}
				}				
			}
			/* keskel vasakul */
			if(x>0&&x<9&&y==9){
				if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1){
					laud.maaraKorvalRuut(x-1,y-1);
					laud.maaraKorvalRuut(x,y-1);
					laud.maaraKorvalRuut(x+1,y-1);
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x-1,y);
					laud.maaraKorvalRuut(x+1,y);
					onVaba=true;
					if(onVaba){
						break;
					}
				}					
			}
			/* all paremal */
			if(x==9&&y==0){
				if(laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]!=1){
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x-1,y);
					laud.maaraKorvalRuut(x,y+1);
					laud.maaraKorvalRuut(x-1,y+1);
					onVaba=true;
					if(onVaba){
						break;
					}
				}				
			}
			/* all keskel */
			if(x==9&&y>0&&y<9){
				if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]!=1){
					laud.maaraKorvalRuut(x-1,y-1);
					laud.maaraKorvalRuut(x,y-1);
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x-1,y);
					laud.maaraKorvalRuut(x,y+1);
					laud.maaraKorvalRuut(x-1,y+1);
					onVaba=true;
					if(onVaba){
						break;
					}
				}				
			}				
			/* all vasakul */
			if(x==9&&y==9){
				if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0){
					laud.maaraKorvalRuut(x-1,y-1);
					laud.maaraKorvalRuut(x,y-1);
					ruut1.maaraRuut(x,y);
					laud.maaraLaevaRuut(x,y);
					laud.maaraKorvalRuut(x-1,y);
					onVaba=true;
					if(onVaba){
						break;
					}
				}	
			}	
		}
	}
}