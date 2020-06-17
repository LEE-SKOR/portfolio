package interfaceTest;

public class Won2Dollar extends Converter{
	public Won2Dollar(int don) {
		super.ratio = don;
	}
	double convert(double src) {
		return src/ratio;
	}
	String srcString() {
		return "¿ø";
	}
	String destString() {
		return "´Þ·¯";
	}
}
