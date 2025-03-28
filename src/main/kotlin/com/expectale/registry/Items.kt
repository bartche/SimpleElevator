package com.expectale.registry

import com.expectale.SimpleElevator
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by SimpleElevator.registry {
    
    val BLACK_ELEVATOR = registerItem("block/black_elevator")
    val BLUE_ELEVATOR = registerItem("block/blue_elevator")
    val BROWN_ELEVATOR = registerItem("block/brown_elevator")
    val CYAN_ELEVATOR = registerItem("block/cyan_elevator")
    val GRAY_ELEVATOR = registerItem("block/gray_elevator")
    val GREEN_ELEVATOR = registerItem("block/green_elevator")
    val LIGHT_BLUE_ELEVATOR = registerItem("block/light_blue_elevator")
    val LIGHT_GRAY_ELEVATOR = registerItem("block/light_gray_elevator")
    val LIME_ELEVATOR = registerItem("block/lime_elevator")
    val MAGENTA_ELEVATOR = registerItem("block/magenta_elevator")
    val ORANGE_ELEVATOR = registerItem("block/orange_elevator")
    val PINK_ELEVATOR = registerItem("block/pink_elevator")
    val PURPLE_ELEVATOR = registerItem("block/purple_elevator")
    val RED_ELEVATOR = registerItem("block/red_elevator")
    val WHITE_ELEVATOR = registerItem("block/white_elevator")
    val YELLOW_ELEVATOR = registerItem("block/yellow_elevator")

}