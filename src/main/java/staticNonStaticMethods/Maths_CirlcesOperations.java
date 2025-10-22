package staticNonStaticMethods;

public class Maths_CirlcesOperations {

public static void main(String[] args) {
	
Maths_CirlcesOperations obj = new Maths_CirlcesOperations();
obj.Weight();
obj.PotentialEnergy();
obj.ForceDueToGravity();
	
}


float gravity;

public Maths_CirlcesOperations() {
	 gravity = 9.81f; // in m/s^2	
}


public  void Weight() {	
	
	float mass = 10.0f; // in kilograms
	float weight = mass * gravity;
	System.out.println("Weight: " + weight + " N");
	
}

public  void PotentialEnergy() {
	
	float mass = 5f; // in kilograms
	float height = 10f; // in meters	
	float potentialEnergy = mass * gravity * height;
	System.out.println("Potential Energy: " + potentialEnergy + " J");
}

public  void ForceDueToGravity() {
	
	float mass = 15f; // in kilograms
	float force = mass * gravity;
	System.out.println("Force due to Gravity: " + force + " N");
}



}
