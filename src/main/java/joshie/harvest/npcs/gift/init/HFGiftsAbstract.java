package joshie.harvest.npcs.gift.init;

import joshie.harvest.api.HFApi;
import joshie.harvest.api.npc.gift.GiftCategory;

public class HFGiftsAbstract {
    public static void assignGeneric(Object object, GiftCategory category) {
        HFApi.npc.getGifts().setCategory(object, category);
    }
}
