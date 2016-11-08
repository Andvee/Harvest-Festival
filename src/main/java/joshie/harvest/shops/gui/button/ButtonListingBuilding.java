package joshie.harvest.shops.gui.button;

import joshie.harvest.api.shops.IPurchasableBuilder;
import joshie.harvest.core.helpers.StackHelper;
import joshie.harvest.core.lib.HFModInfo;
import joshie.harvest.shops.gui.GuiNPCShop;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.StringUtils;

public class ButtonListingBuilding extends ButtonListing<IPurchasableBuilder> {
    public static final ItemStack log = new ItemStack(Blocks.LOG);
    public static final ItemStack stone = new ItemStack(Blocks.STONE);
    private final ItemStack theLogs;
    private final ItemStack theStone;

    public ButtonListingBuilding(GuiNPCShop shop, IPurchasableBuilder purchasable, int buttonId, int x, int y) {
        super(shop, purchasable, buttonId, x, y);
        theLogs = StackHelper.toStack(log, purchasable.getLogCost());
        theStone = StackHelper.toStack(stone, purchasable.getStoneCost());
    }

     @Override
    public void drawForeground(Minecraft mc, FontRenderer fontrenderer, int j) {
        //Names
        drawString(fontrenderer, StringUtils.left(displayString, 18), xPosition + 20, yPosition + (height - 8) / 2, j);
        StackHelper.drawStack(purchasable.getDisplayStack(), xPosition + 2, yPosition + 1, 1F);
        //Draw the cost
        if (purchasable.getCost() > 0) {
            String cost = shop.getCostAsString(purchasable.getCost());
            int width = fontrenderer.getStringWidth(cost);
            mc.renderEngine.bindTexture(HFModInfo.ELEMENTS);
            drawTexturedModalRect(xPosition + 184, (yPosition + (height - 8) / 2) - 2, 244, 0, 12, 12);
            drawString(fontrenderer, cost, xPosition + 180 - width, yPosition + (height - 8) / 2, j);
        }

        //Draw the stone
        if (purchasable.getStoneCost() > 0) {
            StackHelper.drawStack(StackHelper.toStack(stone, purchasable.getStoneCost()), xPosition + 135, yPosition + 3, 0.75F);
        }

        //Draw the logs
        if (purchasable.getLogCost() > 0) {
            StackHelper.drawStack(StackHelper.toStack(log, purchasable.getLogCost()), xPosition + 117, yPosition + 3, 0.75F);
        }
    }
}