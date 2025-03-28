package com.expectale.registry

import com.expectale.SimpleElevator
import org.joml.Vector3d
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.world.item.NovaItem

@Init(stage = InitStage.PRE_PACK)
object Models : ItemRegistry by SimpleElevator.registry {

	val BLACK_ELEVATOR = modelItem("block/black_elevator")
    val BLUE_ELEVATOR = modelItem("block/blue_elevator")
    val BROWN_ELEVATOR = modelItem("block/brown_elevator")
    val CYAN_ELEVATOR = modelItem("block/cyan_elevator")
    val GRAY_ELEVATOR = modelItem("block/gray_elevator")
    val GREEN_ELEVATOR = modelItem("block/green_elevator")
    val LIGHT_BLUE_ELEVATOR = modelItem("block/light_blue_elevator")
    val LIGHT_GRAY_ELEVATOR = modelItem("block/light_gray_elevator")
    val LIME_ELEVATOR = modelItem("block/lime_elevator")
    val MAGENTA_ELEVATOR = modelItem("block/magenta_elevator")
    val ORANGE_ELEVATOR = modelItem("block/orange_elevator")
    val PINK_ELEVATOR = modelItem("block/pink_elevator")
    val PURPLE_ELEVATOR = modelItem("block/purple_elevator")
    val RED_ELEVATOR = modelItem("block/red_elevator")
    val WHITE_ELEVATOR = modelItem("block/white_elevator")
    val YELLOW_ELEVATOR = modelItem("block/yellow_elevator")
    
    private fun modelItem(name: String): NovaItem = item(name) {
        modelDefinition { model = buildModel { getModel(name) } }
    }
    
}