package builderPattern.builders

import builderPattern.components.RoofColor
import builderPattern.houses.HouseType

interface Builder {

    fun setHouseType(type: HouseType)
    fun setRoomsAmount(rooms: Int)
    fun setFloorsAmount(floors: Int)
    fun setPool(pool: Boolean)
    fun setRoofColor(roofColor: RoofColor)

}