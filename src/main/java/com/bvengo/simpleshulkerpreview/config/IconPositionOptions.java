package com.bvengo.simpleshulkerpreview.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;

public class IconPositionOptions {
    @ConfigEntry.Gui.Tooltip()
    @ConfigEntry.BoundedDiscrete(min = 0, max = 16)
    public int translateX;

    @ConfigEntry.Gui.Tooltip()
    @ConfigEntry.BoundedDiscrete(min = 0, max = 16)
    public int translateY;

    @ConfigEntry.Gui.Tooltip()
    @ConfigEntry.BoundedDiscrete(min = 1, max = 16)
    public int scale;

    public IconPositionOptions(int x, int y, int scale) {
        this.translateX = x;
        this.translateY = y;
        this.scale = scale;
    }
}