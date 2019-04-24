package com.jineric.Spring_XLM_Config_Example;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public void doMyStartUpStuff(){
        System.out.println("Inside TrackCoach start up stuff");
    }

    public void doMyCleanUpStuff(){
        System.out.println("Inside TrackCoach clean up stuff");
    }
}
