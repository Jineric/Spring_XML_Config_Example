package com.jineric.Spring_XLM_Config_Example;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAddress;

    private String team;

    public CricketCoach(){
        System.out.println("Inside of the CricketCoach constructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside of the set email address");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside of the set team");
        this.team = team;
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
