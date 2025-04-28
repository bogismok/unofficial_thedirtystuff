package net.mcreator.thedirtystuff.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.thedirtystuff.world.inventory.WorkstationGUIMenu;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay9Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay8Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay7Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay6Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay5Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay4Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay3Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay2Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay22Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay21Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay20Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay1Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay19Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay18Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay17Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay16Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay15Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay14Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay13Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay12Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay11Procedure;
import net.mcreator.thedirtystuff.procedures.ProgressArrowDisplay10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WorkstationGUIScreen extends AbstractContainerScreen<WorkstationGUIMenu> {
	private final static HashMap<String, Object> guistate = WorkstationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WorkstationGUIScreen(WorkstationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_dirty_stuff:textures/screens/workstation_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_0.png"));
		this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);

		if (ProgressArrowDisplay1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_1.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_2.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_3.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_4.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_5.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_6.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_7.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_8.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_9.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_10.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_11.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_12.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_13.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay14Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_14.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay15Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_15.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay16Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_16.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay17Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_17.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay18Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_18.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay19Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_19.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay20Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_20.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_21.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}
		if (ProgressArrowDisplay22Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/arrow_22.png"));
			this.blit(ms, this.leftPos + 63, this.topPos + 39, 0, 0, 22, 16, 22, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("the_dirty_stuff:textures/screens/bottle_gui.png"));
		this.blit(ms, this.leftPos + 125, this.topPos + 39, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.the_dirty_stuff.workstation_gui.label_workstation"), 59, 11, -12829636);
	}

	@Override
	public void init() {
		super.init();
	}
}
