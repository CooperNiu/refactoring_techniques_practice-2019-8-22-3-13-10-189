package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
    	int base_price = quantity * itemPrice;
    	double discount_prince = Math.max(0, quantity - 500) * itemPrice * 0.05;
    	double shipping_cost = Math.min(quantity * itemPrice * 0.1, 100.0);
    	double price = base_price- discount_prince + shipping_cost;
    	
        return price;
    }
}
