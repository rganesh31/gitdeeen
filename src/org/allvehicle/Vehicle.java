package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;


public class Vehicle {
	
	public void VehicleNecessary() {
		System.out.println("Vehicle Necessary Information");
	}

	public static void main (String[] args) {
		
	 Vehicle V=new Vehicle();
	 V.VehicleNecessary();
	 
	 TwoWheeler t=new TwoWheeler();
	 t.bike();
	 t.cycle();
	 
	 ThreeWheeler T=new ThreeWheeler();
	 T.Auto();
	 
	 FourWheeler F=new FourWheeler();
	 F.car();
	 F.bus();
	 F.lorry();
	 
	 }
	 
	 
		
	}
	
