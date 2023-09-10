package CreationalDesignPatterns.Factory;

import CreationalDesignPatterns.Factory.Components.Button.Button;
import CreationalDesignPatterns.Factory.Components.Button.IosButton;
import CreationalDesignPatterns.Factory.Components.Dropdown.DropDown;
import CreationalDesignPatterns.Factory.Components.Dropdown.IosDropDown;
import CreationalDesignPatterns.Factory.Components.Menu.IosMenu;
import CreationalDesignPatterns.Factory.Components.Menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton(){
        return new IosButton();
    }

    @Override
    public Menu createMenu(){
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown(){
        return new IosDropDown();
    }
}
