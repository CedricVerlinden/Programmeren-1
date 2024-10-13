package Week5.Tekenprogramma;

public enum Colour {

	CYAN(0),
	MAGENTA(1),
	YELLOW(2);

	private int code;

	Colour (int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
