package com.tws.refactoring.extract_method;

import java.util.Iterator;
import java.util.List;

public class OwingPrinter {
	void printBanner() {
		// print banner
	    System.out.println ("*****************************");
	    System.out.println ("****** Customer totals ******");
	    System.out.println ("*****************************");
	}
	
	double printOwings(Iterator<Order> elements, double outstanding) {
		// print owings
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            outstanding += each.getAmount();
        }
        return outstanding;
	}
	
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        printBanner();

        outstanding = printOwings(elements, outstanding);

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
