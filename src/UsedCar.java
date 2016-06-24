
public class UsedCar extends Car {

	// fields
	private int mMiles;

	// constructor
	public UsedCar(String make, String model, int year, double price, int miles) {
		super(make, model, year, price);

		mMiles = miles;
	}

//	// getters
//	public int getMiles1() {
//		return mMiles;
//	}

	// setters
	public void setMiles(int miles){
		mMiles = miles;
	}

	public int getMiles(){
		return mMiles;
	}
}
