package com.miit;

public class TransportFactory {

	public Transport getType(String str) {
		if (str.equals("bus")) {
			return new Bus();
		} else if (str.equals("car")) {
			return new Car();
		} else if (str.equals("train")) {
			return new Train();
		} else if (str.equals("")) {
			return null;
		}
		return null;
	}

}
