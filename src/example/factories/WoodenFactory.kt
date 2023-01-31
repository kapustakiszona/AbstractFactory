package example.factories

import example.forks.Fork
import example.forks.WoodenFork
import example.spoons.Spoon
import example.spoons.WoodenSpoon

class WoodenFactory : CutleryFactory {

    override fun createSpoon(): Spoon {
        return WoodenSpoon()
    }

    override fun createFork(): Fork {
        return WoodenFork()
    }

}