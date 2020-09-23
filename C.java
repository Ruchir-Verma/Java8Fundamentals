
public class C extends B implements Interface_B, Interface_A {

	public static void main(String[] args) {
		C obj = new C();
		obj.show();
	} // B's show() will get called as class have more precedence than
		// interfaces

}
