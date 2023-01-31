package builderPattern.houses

import builderPattern.components.RoofColor

class DogHouse(type: HouseType?, rooms: Int, floors: Int, pool: Boolean, roofColor: RoofColor?) {

    private var type: HouseType? = null
    private var rooms: Int = 0
    private var floors: Int = 0
    private var pool: Boolean = false
    private var roofColor: RoofColor? = null

    init {
        this.type = type
        this.rooms = rooms
        this.floors = floors
        this.pool = pool
        this.roofColor = roofColor
    }

    fun getHouseType(): HouseType? {
        return type
    }

    fun getRoofColor(): RoofColor? {
        return roofColor
    }
}