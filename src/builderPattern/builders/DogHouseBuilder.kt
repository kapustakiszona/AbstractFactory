package builderPattern.builders

import builderPattern.components.RoofColor
import builderPattern.houses.DogHouse
import builderPattern.houses.HouseType

class DogHouseBuilder : Builder {

    private var type: HouseType? = null
    private var rooms: Int = 0
    private var floors: Int = 0
    private var pool: Boolean = false
    private var roofColor: RoofColor? = null

    override fun setHouseType(type: HouseType) {
        this.type = type
    }

    override fun setRoomsAmount(rooms: Int) {
        this.rooms = rooms
    }

    override fun setFloorsAmount(floors: Int) {
        this.floors = floors
    }

    override fun setPool(pool: Boolean) {
        this.pool = pool
    }

    override fun setRoofColor(roofColor: RoofColor) {
        this.roofColor = roofColor
    }

    val result: DogHouse get() = DogHouse(type, rooms, floors, pool, roofColor)
}