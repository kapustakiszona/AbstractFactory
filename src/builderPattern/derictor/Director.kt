package builderPattern.derictor

import builderPattern.builders.Builder
import builderPattern.components.RoofColor
import builderPattern.houses.HouseType

class Director {

    fun constructorRegularBrickHouse(builder: Builder) {
        builder.setHouseType(HouseType.BRICK_HOUSE)
        builder.setPool(false)
        builder.setFloorsAmount(2)
        builder.setRoofColor(RoofColor.RED)
        builder.setRoomsAmount(6)
    }

    fun constructorBigWoodenHouse(builder: Builder) {
        builder.setHouseType(HouseType.WOODEN_HOUSE)
        builder.setRoofColor(RoofColor.GREEN)
        builder.setPool(true)
        builder.setFloorsAmount(3)
        builder.setFloorsAmount(10)
    }

    fun constructorSmallStoneHouse(builder: Builder) {
        builder.setHouseType(HouseType.STONE_HOUSE)
        builder.setPool(false)
        builder.setFloorsAmount(1)
        builder.setRoomsAmount(2)
        builder.setRoofColor(RoofColor.YELLOW)
    }

}