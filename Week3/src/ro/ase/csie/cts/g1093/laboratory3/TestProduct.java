package ro.ase.csie.cts.g1093.laboratory3;

import ro.ase.csie.cts.g1093.laboratory3.stage1.Product;
import ro.ase.csie.cts.g1093.laboratory3.stage1.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		try {
		product.getFinalPrice(ProductType.NEW, 0, 0);
		}

	}

}
