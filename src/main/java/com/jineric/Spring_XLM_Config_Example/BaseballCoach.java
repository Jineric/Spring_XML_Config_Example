package com.jineric.Spring_XLM_Config_Example;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    private BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
