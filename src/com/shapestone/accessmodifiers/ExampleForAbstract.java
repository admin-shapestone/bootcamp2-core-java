package com.shapestone.accessmodifiers;

import com.shapestone.accessmodifiers.TestForAbstarct;

abstract class ExampleForAbstract {

	abstract int NoOfVehicles();

}

class Bus extends ExampleForAbstract {
	int NoOfVehicles() {
		return 10;

	}

}

class Car extends ExampleForAbstract {

	@Override
	int NoOfVehicles() {

		return 4;
	}

}
