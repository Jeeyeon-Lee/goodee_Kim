package aquiz.step1;
// private < friendly < protected < public
class BaseClass {
	private float x = 1.0f;

	protected float getVar() {
		return x;
	}
}

class SubClass extends BaseClass {
	private float x = 2.0f;
	public float getVar() { return x; }
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
