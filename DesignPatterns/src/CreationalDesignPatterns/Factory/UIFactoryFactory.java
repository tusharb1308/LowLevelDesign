package CreationalDesignPatterns.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform platform){
        return switch (platform){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}

/*
    UIFactory -> creates object of UI elements, Menu, DropDown, Button etc.
    UIFactoryFactory -> creating objects of UIFactory, AndroidFactory/IosFactory
 */