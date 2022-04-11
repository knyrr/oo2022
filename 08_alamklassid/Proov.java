import java.util.*;
import java.io.*;

public class Proov{
	static int kasutajaX, kasutajaY;
	static String sisend;	
	
	public static void main(String[] arg){
		Laud laud = new Laud();
 		Laev4 laev4_1 = new Laev4();
		Laev3 laev3_1 = new Laev3();
		Laev3 laev3_2 = new Laev3(); 
		Laev2 laev2_1 = new Laev2();
		Laev2 laev2_2 = new Laev2();
		Laev2 laev2_3 = new Laev2();
		Laev1 laev1_1 = new Laev1();
		Laev1 laev1_2 = new Laev1();
		Laev1 laev1_3 = new Laev1();
		Laev1 laev1_4 = new Laev1();
		
  		laev4_1.paigutaLaev(laud);
		laev3_1.paigutaLaev(laud);
		laev3_2.paigutaLaev(laud); 
		laev2_1.paigutaLaev(laud);
		laev2_2.paigutaLaev(laud);
		laev2_3.paigutaLaev(laud);
		laev1_1.paigutaLaev(laud);
		laev1_2.paigutaLaev(laud);
		laev1_3.paigutaLaev(laud);
		laev1_4.paigutaLaev(laud);

		System.out.println(laud);
		System.out.println(laev4_1);
		System.out.println(laev3_1);
		System.out.println(laev3_2);
		System.out.println(laev2_1);
		System.out.println(laev2_2);
		System.out.println(laev2_3);
		System.out.println(laev1_1);
		System.out.println(laev1_2);
		System.out.println(laev1_3);
		System.out.println(laev1_4);

		
	}
}		
/* 
[marrun@greeny 08_alamklassid]$ java Proov

0 0 0 0 2 1 2 1 1 1
2 2 2 2 2 2 2 2 2 2
2 1 2 2 1 1 2 2 2 2
2 1 2 2 2 2 2 2 1 2
2 2 2 0 0 2 2 2 1 2
1 2 0 0 0 2 1 2 2 2
1 2 0 2 2 2 2 2 2 0
1 2 0 2 1 1 1 1 2 0
2 2 0 2 2 2 2 2 2 2
0 0 0 2 1 2 0 2 1 2

7, 4
7, 5
7, 6
7, 7

0, 7
0, 8
0, 9

5, 0
6, 0
7, 0

3, 8
4, 8

2, 1
3, 1

2, 4
2, 5

0, 5

9, 4

9, 8

5, 6

 */