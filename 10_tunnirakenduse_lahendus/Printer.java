public class Printer <T>{
	private T prinditav;
	
	public Printer(T prinditav){
		this.prinditav = prinditav;
	}
	
	public T kysiVaartus(){
		return prinditav;
	}
	
	public void prindi(){
		System.out.println(prinditav);
	}
}