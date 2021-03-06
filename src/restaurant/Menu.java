package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menus;

    public Menu(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public Menu() {
        this.menus = new ArrayList<>();
    }

    public ArrayList<MenuItem> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<MenuItem> menus) {
        this.menus = menus;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        this.menus.add(aMenuItem);
    }
}