package CreationalDesignPatterns.Factory;

import CreationalDesignPatterns.Factory.Components.Button.AndroidButton;
import CreationalDesignPatterns.Factory.Components.Button.Button;
import CreationalDesignPatterns.Factory.Components.Dropdown.AndroidDropDown;
import CreationalDesignPatterns.Factory.Components.Dropdown.DropDown;
import CreationalDesignPatterns.Factory.Components.Menu.AndroidMenu;
import CreationalDesignPatterns.Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton(){
        return new AndroidButton();
    }

    @Override
    public Menu createMenu(){
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown(){
        return new AndroidDropDown();
    }

}
