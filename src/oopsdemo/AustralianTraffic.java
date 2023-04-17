package oopsdemo;

public class AustralianTraffic implements TrafficRule {

	@Override
	public void greenLight() {
		System.out.println("Australian Green Light Time out is 30sec");
		
	}

	@Override
	public void redLight() {
		System.out.println("Australian Red Light Time out is 10sec");
		
	}

	@Override
	public void yellowLight() {
		
		System.out.println("Australian Green Light Time out is 5sec");
	}

}
