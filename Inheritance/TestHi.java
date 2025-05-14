

package polymorsphism.com;

public class TestHi {
	
	public static void main(String[] args) {
		Dogs s = new Dogs();
		System.out.println("About Dogs");
		s.dogName="GermanShefrd";
		System.out.println("Dog Name: "+s.dogName);
		s.sounds();
		s.dog();
		System.out.println();
		System.out.println("About Birds");
		Birds b = new Birds();
	    b.bird="parrot";
	    System.out.println("Bird Name: "+b.bird);
		b.sounds();
		b.birds();

	}
}
