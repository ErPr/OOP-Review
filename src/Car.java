
public class Car {

	// fields
	private String mMake;
	private String mModel;
	private int mYear;
	private double mPrice;

	// constructor
	public Car(String make, String model, int year, double price) {
		mMake = make;
		mModel = model;
		mYear = year;
		mPrice = price;
	}

	// manually created getters
	public String getMake() {
		return mMake;
	}

	public String getModel() {
		return mModel;
	}

	public int getYear() {
		return mYear;
	}

	public double getPrice() {
		return mPrice;
	}

	// setters
	public void setMake(String make) {
		mMake = make;
	}

	public void setModel(String model) {
		mModel = model;
	}

	public void setYear(int year) {
		mYear = year;
	}

	public void setPrice(double price) {
		mPrice = price;
	}

}
