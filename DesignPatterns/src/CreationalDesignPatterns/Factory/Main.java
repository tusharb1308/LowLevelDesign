package CreationalDesignPatterns.Factory;

import CreationalDesignPatterns.Factory.Components.Button.Button;
import CreationalDesignPatterns.Factory.Components.Dropdown.DropDown;
import CreationalDesignPatterns.Factory.Components.Menu.Menu;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = UIFactoryFactory.getUIFactory(SupportedPlatform.WINDOWS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}
