package builderPattern

import builderPattern.builders.DogHouseBuilder
import builderPattern.builders.HouseBuilder
import builderPattern.derictor.Director


fun main() {
    val director = Director()

    val builder = HouseBuilder()
    director.constructorBigWoodenHouse(builder)
    val myHouse = builder.result
    println("My house is ${myHouse.getHouseType()} with ${myHouse.getRoofColor()} roof")

    val dogHouseBuilder = DogHouseBuilder()
    director.constructorSmallStoneHouse(dogHouseBuilder)
    val myDogsHouse = dogHouseBuilder.result
    println("My dog's house is ${myDogsHouse.getHouseType()} with ${myDogsHouse.getRoofColor()} roof")



}