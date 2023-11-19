package java8features;

public class SwitchStmt {

	public static void main(String[] args) {
		String key = "Friday";
		String result = switch (key) {
		case "Sunday", "Surturday": {
			yield "8am";
		}
		case "Monday", "Thusday": {
			yield "6am";
		}
		case "Friday": {
			yield "7am";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		};
		System.out.println(result);
	}

}
