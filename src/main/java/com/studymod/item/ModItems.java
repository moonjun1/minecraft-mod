package com.studymod.item;

import com.studymod.StudyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // 스터디 검 - 다이아몬드급 공격력 + 추가 데미지
    public static final Item STUDY_SWORD = Registry.register(
        Registries.ITEM,
        new Identifier(StudyMod.MOD_ID, "study_sword"),
        new SwordItem(ToolMaterials.DIAMOND, 5, -2.4f, new FabricItemSettings())
    );

    // 스터디 사과 - 먹을 수 있는 아이템
    public static final Item STUDY_APPLE = Registry.register(
        Registries.ITEM,
        new Identifier(StudyMod.MOD_ID, "study_apple"),
        new Item(new FabricItemSettings().food(
            new net.minecraft.item.FoodComponent.Builder()
                .hunger(10)
                .saturationModifier(2.0f)
                .alwaysEdible()
                .build()
        ))
    );

    public static void registerItems() {
        StudyMod.LOGGER.info("아이템 등록 중...");
    }
}
