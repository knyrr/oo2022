public class AritmeetilineKeskmine {

	public static double akeskm(double[] arvud){
		double summa=0;
		for(int i=0;i<3; i++){
			summa+=arvud[i];
		}
		return summa/arvud.length;
	}
	
	public static void main(String[] args){
		double[] arvud=new double[3];
		arvud[0]=4;
		arvud[1]=5;
		arvud[2]=6;
		double kesk=akeskm(arvud);
		System.out.println(kesk);
	}
	
}