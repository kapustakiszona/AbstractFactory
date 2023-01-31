package example.factories

import example.forks.Fork
import example.spoons.Spoon

interface CutleryFactory {

    fun createSpoon(): Spoon

    fun createFork(): Fork

}