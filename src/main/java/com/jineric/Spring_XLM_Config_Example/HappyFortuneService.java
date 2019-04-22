package com.jineric.Spring_XLM_Config_Example;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
