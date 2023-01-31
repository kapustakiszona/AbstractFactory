package example.factories

import example.forks.Fork
import example.forks.MetalFork
import example.spoons.MetalSpoon
import example.spoons.Spoon




class MetalFactory : CutleryFactory {

    override fun createSpoon(): Spoon {
        return MetalSpoon()
    }

    override fun createFork(): Fork {
        return MetalFork()
    }

}