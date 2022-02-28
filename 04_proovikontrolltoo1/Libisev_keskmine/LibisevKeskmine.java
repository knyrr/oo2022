import java.util.Arrays;

public class LibisevKeskmine {

	public static double[] libisevKeskmine(double[] arvud){
		double[] libisevKeskmine=new double[arvud.length-2];
		double summa=0;
		if (arvud.length<3){
			throw new RuntimeException("Pole piisavalt arve");
		} else {
			for(int i=0;i<arvud.length-2; i++){
				summa=arvud[i]+arvud[i+1]+arvud[i+2];
				libisevKeskmine[i]=summa/3;
				summa=0;
			}
			return libisevKeskmine;
		}
	}
	
	public static void main(String[] args){
		double[] arvud=new double[5];
		double[] libisevKeskmine=new double[arvud.length-2];
		arvud[0]=4;
		arvud[1]=5;
 		arvud[2]=6;
		arvud[3]=7;
		arvud[4]=8;
		libisevKeskmine=libisevKeskmine(arvud);
		System.out.println(Arrays.toString(libisevKeskmine));
	}
}