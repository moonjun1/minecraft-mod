package com.studymod;

import com.studymod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudyMod implements ModInitializer {
    public static final String MOD_ID = "studymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        LOGGER.info("StudyMod 로딩 완료!");
    }
}
