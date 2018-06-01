package controller;

import model.Almanac;
import model.Theme;

public final class Helper {
	static Almanac almanac;
	static Theme[] themes;
	
	static {
		almanac = Runner.getAlmanac();
		themes = almanac.getThemes();
	}
	
	public static String setingText(String name) {
		for (Theme theme : themes) {
			if (name != null && name.equals(theme.getName())) {
				return theme.getText();
			}
		}
		return "Ошибка чтения";
	}
}
