package interfaceTest;

public class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}
	double convert(double src) {
		return src/ratio;
	}
	String srcString() {
		return "KM";
	}
	String destString() {
		return "Mile";
	}
}
