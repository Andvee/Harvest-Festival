package joshie.harvest.quests.player.friendship;

import joshie.harvest.api.HFApi;
import joshie.harvest.api.quests.HFQuest;
import joshie.harvest.api.quests.Quest;
import joshie.harvest.npc.HFNPCs;
import joshie.harvest.quests.Quests;
import joshie.harvest.quests.base.QuestFriendship;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Set;

@HFQuest("friendship.yulif.sprinkler")
public class QuestYulif extends QuestFriendship {
    public QuestYulif() {
        super(HFNPCs.BUILDER, 15000);
    }

    @Override
    public boolean canStartQuest(Set<Quest> active, Set<Quest> finished) {
        return finished.contains(Quests.RECIPE_CHOCOLATE_CAKE);
    }

    @Override
    public void onQuestCompleted(EntityPlayer player) {
        super.onQuestCompleted(player);
        HFApi.quests.completeQuestConditionally(Quests.SPRINKLER, player);
    }
}