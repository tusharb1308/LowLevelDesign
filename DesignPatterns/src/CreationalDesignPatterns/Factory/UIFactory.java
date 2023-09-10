package CreationalDesignPatterns.Factory;

import CreationalDesignPatterns.Factory.Components.Button.Button;
import CreationalDesignPatterns.Factory.Components.Dropdown.DropDown;
import CreationalDesignPatterns.Factory.Components.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
