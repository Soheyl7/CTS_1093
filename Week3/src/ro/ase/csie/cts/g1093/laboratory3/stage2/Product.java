package ro.ase.csie.cts.g1093.laboratory3.stage2;

import ro.ase.csie.cts.g1093.laboratory3.exception.InvalidPriceException;
import ro.ase.csie.cts.g1093.laboratory3.exception.InvlaidAccountAgeException;

public class Product {
	
	public static final int MAX_ACCOUNT_AGE = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public static void validatePrice(float price) throws InvalidPriceException {
		if(price <= 0) {
			throw new InvalidPriceException();
		}
	}
	
	public static void validateAccountAge(int accountAgeInYears) throws InvlaidAccountAgeException {
		if(accountAgeInYears < 0) {
			throw new InvlaidAccountAgeException();
		}
	}
	
	public static float getFidelityDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float)accountAgeInYears/100;
	}
	
	public static float getPriceWithDiscount(float initialPrice, float discountValue) {
		return initialPrice - (discountValue * initialPrice);
	}
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvlaidAccountAgeException{
		
		validatePrice(initialPrice);
		validateAccountAge(accountAgeInYears);
		
	    float fidelityDiscount = (productType == ProductType.NEW) ? 0 : getFidelityDiscount(accountAgeInYears);
	    float discountValue = productType.getDiscount();
		float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
		float finalPrice = priceWithDiscount*(1-fidelityDiscount);
	    
		return finalPrice;
	}
}