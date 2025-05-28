package com.LLD.DesignPatterns.factory;

public class Flutter {
    //Non factory methods

    void UiRefresh(){
        System.out.println("UiRefresh..");
    }

    void setTheme(){
        System.out.println("setTheme...");
    }

    public UIFactory getUIFactory(SupportedPlatforms platform){
        return UIFactoryHelper.getPlatformType(platform);
    }
}
