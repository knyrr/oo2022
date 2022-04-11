import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Laev2 extends Laev{
	int suund;
	Ruut ruut1 = new Ruut();
	Ruut ruut2 = new Ruut();
	
	public Laev2(){
		ruudud.add(ruut1);
		ruudud.add(ruut2);
	}
	
	public void maaraSuund(){
		suund = ThreadLocalRandom.current().nextInt(0, 2);
	}

	public void paigutaLaev(Laud laud){
		
		boolean onVaba = false;
		while(!onVaba){
			maaraSuund();
			
			if(suund==0){
  				x=ThreadLocalRandom.current().nextInt(0,10);
				y=ThreadLocalRandom.current().nextInt(0,9);
		
				/* üleval paremal */
				if(x==0&&y==0){
					if(laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x][y+2]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+1][y+2]!=1){
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x+1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x,y+2);
						laud.maaraKorvalRuut(x+1,y+2);
						onVaba=true;
						if(onVaba){
							break;
						}
					}
				}
				
				/* üleval keskel */
				if(x==0&&y>0&&y<8){
					if(laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x][y+2]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+1][y+2]!=1){
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x+1,y-1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x+1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x,y+2);
						laud.maaraKorvalRuut(x+1,y+2);
						onVaba=true;
						if(onVaba){
							break;
						}
					}
					
				}
				/* üleval vasakul */
				if(x==0&&y==9){
					if(laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1){
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x+1,y-1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x+1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x+1,y+1);				
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* keskel paremal */
				if(x>0&&x<9&&y==0){
					if(laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x-1][y+2]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x][y+2]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+1][y+2]!=1){
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x+1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x-1,y+1);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x,y+2);
						laud.maaraKorvalRuut(x-1,y+2);
						laud.maaraKorvalRuut(x+1,y+2);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* keskel keskel */
				if(x>0&&x<9&&y>0&&y<8){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x-1][y+2]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x][y+2]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+1][y+2]!=1){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x+1,y-1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x+1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x-1,y+1);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x,y+2);
						laud.maaraKorvalRuut(x-1,y+2);
						laud.maaraKorvalRuut(x+1,y+2);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* keskel vasakul */
				if(x>0&&x<9&&y==8){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x+1][y-1]!=1&&laud.laud[x+1][y]!=1&&laud.laud[x+1][y+1]!=1){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x+1,y-1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x+1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x-1,y+1);
						laud.maaraKorvalRuut(x+1,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}					
				}
				/* all paremal */
				if(x==9&&y==0){
					if(laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x-1][y+2]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x][y+2]!=1){
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x-1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x-1,y+1);
						laud.maaraKorvalRuut(x,y+2);
						laud.maaraKorvalRuut(x-1,y+2);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* all keskel */
				if(x==9&&y>0&&y<8){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x-1][y+2]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0&&laud.laud[x][y+2]!=1){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x,y-1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x-1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x-1,y+1);
						laud.maaraKorvalRuut(x,y+2);
						laud.maaraKorvalRuut(x-1,y+2);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}				
				/* all vasakul */
				if(x==9&&y==8){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x][y+1]==0){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x,y-1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x-1,y);
						ruut2.maaraRuut(x,y+1);
						laud.maaraLaevaRuut(x,y+1);
						laud.maaraKorvalRuut(x-1,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}	
				}
			}
			
			if(suund==1){
 				x=ThreadLocalRandom.current().nextInt(0,9);
				y=ThreadLocalRandom.current().nextInt(0,10);
				
				/* paremal üleval */
				if(x==0&&y==0){
					if(laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x+2][y]!=1&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+2][y+1]!=1){
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y+1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x+2,y);
						laud.maaraKorvalRuut(x+2,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}
				}
				/* paremal keskel */
				if(x>0&&x<8&&y==0){
					if(laud.laud[x-1][y]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x+2][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+2][y+1]!=1){
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x-1,y+1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y+1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x+2,y);
						laud.maaraKorvalRuut(x+2,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}
					
				}
				
				/* paremal all */
				if(x==8&&y==0){
					if(laud.laud[x-1][y]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y+1]!=1){
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x-1,y+1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y+1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* keskel üleval */
				if(x==0&&y>0&&y<9){
					if(laud.laud[x][y-1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+2][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x+2][y]!=1&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+2][y+1]!=1){
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x,y+1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y-1);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x+2,y);
						laud.maaraKorvalRuut(x+2,y-1);
						laud.maaraKorvalRuut(x+2,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* keskel keskel */
				if(x>0&&x<8&&y>0&&y<9){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+2][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x+2][y]!=1&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y+1]!=1&&laud.laud[x+2][y+1]!=1){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x-1,y+1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x,y+1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y-1);
						laud.maaraKorvalRuut(x+1,y+1);
						laud.maaraKorvalRuut(x+2,y);
						laud.maaraKorvalRuut(x+2,y-1);
						laud.maaraKorvalRuut(x+2,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				
				/* keskel all */
				if(x==8&&y>0&&y<9){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x-1][y+1]!=1&&laud.laud[x][y+1]!=1&&laud.laud[x+1][y+1]!=1){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x-1,y);
						laud.maaraKorvalRuut(x-1,y+1);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y-1);
						laud.maaraKorvalRuut(x,y+1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y-1);
						laud.maaraKorvalRuut(x+1,y+1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}					
				}
				/* vasakul üleval */
				if(x==0&&y==9){
					if(laud.laud[x][y-1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+2][y-1]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x+3][y]!=1){
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y-1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y-1);
						laud.maaraKorvalRuut(x+2,y);
						laud.maaraKorvalRuut(x+2,y-1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}
				/* vasakul keskel */
				if(x>0&&x<8&&y==9){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x+2][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0&&laud.laud[x+2][y]!=1){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x-1,y);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y-1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y-1);
						laud.maaraKorvalRuut(x+2,y);
						laud.maaraKorvalRuut(x+2,y-1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}				
				}				
				/* vasakul all */
				if(x==8&&y==9){
					if(laud.laud[x-1][y-1]!=1&&laud.laud[x][y-1]!=1&&laud.laud[x+1][y-1]!=1&&laud.laud[x-1][y]!=1&&laud.laud[x][y]==0&&laud.laud[x+1][y]==0){
						laud.maaraKorvalRuut(x-1,y-1);
						laud.maaraKorvalRuut(x-1,y);
						ruut1.maaraRuut(x,y);
						laud.maaraLaevaRuut(x,y);
						laud.maaraKorvalRuut(x,y-1);
						ruut2.maaraRuut(x+1,y);
						laud.maaraLaevaRuut(x+1,y);
						laud.maaraKorvalRuut(x+1,y-1);
						onVaba=true;
						if(onVaba){
							break;
						}
					}
				}
			}
		}
	}
}