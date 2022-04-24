public class Proov {
	public static void main(String[] args){
		Printer<String> pr1 = new Printer<>("Prindi see tekst");
		pr1.prindi();

		Printer<Double> pr2 = new Printer<>(2.1);
		pr2.prindi();

		Printer<Integer> pr3 = new Printer<>(2);
		pr3.prindi();

		System.out.println(pr3.kysiVaartus());
	}
}