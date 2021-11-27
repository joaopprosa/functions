package util;

import java.util.function.Function;

import services.Product;

public abstract class UpperCaseName implements Function<Product, String>{

	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
