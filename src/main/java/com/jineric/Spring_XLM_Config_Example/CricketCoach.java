package com.jineric.Spring_XLM_Config_Example;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("Inside of the CricketCoach constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside of the CricketCoach setter");

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
