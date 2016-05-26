package joshie.harvest.core.util.generic;

import joshie.harvest.core.lib.HFModInfo;
import net.minecraft.util.text.translation.I18n;

public class Text {
    public static String localize(String key) {
        return I18n.translateToLocal(key);
    }

    public static String localizeFully(String key) {
        return I18n.translateToLocal(key.replace("_", "."));
    }

    public static String translate(String s) {
        return I18n.translateToLocal(HFModInfo.MODID + "." + s);
    }

    public static String translate(String mod, String s) {
        return I18n.translateToLocal(mod + "." + s);
    }
}