package com.miit;

public class Passenger {

	public static void main(String ars[]) {
		TransportFactory Tf = new TransportFactory();
		Transport car = Tf.getType("car");
		car.VehicleType();

		Transport bus = Tf.getType("bus");
		bus.VehicleType();
		Transport train = Tf.getType("train");
		train.VehicleType();

	}
}