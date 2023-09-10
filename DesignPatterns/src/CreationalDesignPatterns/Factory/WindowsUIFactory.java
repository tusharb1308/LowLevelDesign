package CreationalDesignPatterns.Factory;

import CreationalDesignPatterns.Factory.Components.Button.Button;
import CreationalDesignPatterns.Factory.Components.Button.WindowsButton;
import CreationalDesignPatterns.Factory.Components.Dropdown.DropDown;
import CreationalDesignPatterns.Factory.Components.Dropdown.WindowsDropDown;
import CreationalDesignPatterns.Factory.Components.Menu.Menu;
import CreationalDesignPatterns.Factory.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Menu createMenu(){
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown(){
        return new WindowsDropDown();
    }
}
