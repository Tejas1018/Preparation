package com.prep.DesignPatterns.factory;

public class UIFactoryHelper {

    public static UIFactory getPlatformType(SupportedPlatforms platform) {
        if(platform.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsUIFactory();
        }
        if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        }
        if(platform.equals(SupportedPlatforms.IOS)){
            return new IosUIFactory();
        }
        return null;
    }
}
