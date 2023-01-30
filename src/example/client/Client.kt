package example.client

import example.factories.CutleryFactory
import example.forks.Fork
import example.spoons.Spoon

class Client(factory: CutleryFactory) {
    private val fork: Fork
    private val spoon: Spoon

    init {
        fork = factory.createFork()
        spoon = factory.createSpoon()
    }

    fun polish() {

        fork.polish()
        spoon.polish()

    }

}