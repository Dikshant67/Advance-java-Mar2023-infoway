package com.app.java;

public class TrackCoach implements Coach{
private FortuneService fortuneservice;
private TrackCoach() {}

	public TrackCoach(FortuneService fortuneservice) {
	super();
	this.fortuneservice = fortuneservice;
}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "GET DAILY WORKOUT";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "GET DAILY FORTUNE";
	}
	

}
