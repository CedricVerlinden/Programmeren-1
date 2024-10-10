package Week4.SmartLights;

public class Lamp {

	private String status;

	public void zetAan() {
		status = "aan";
	}

	public void zetUit() {
		status = "uit";
	}

	public String getStatus() {
		return status;
	}
}
