package midpoint.theme;


import midpoint.theme.themes.MidnightPurple;


public class ThemeManager {


    private Theme currentTheme;


    public void initialize() {

        currentTheme = new MidnightPurple();

    }


    public Theme getCurrentTheme() {

        return currentTheme;

    }


    public void setTheme(Theme theme) {

        this.currentTheme = theme;

    }

}
