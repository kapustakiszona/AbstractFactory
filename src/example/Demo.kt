package example

import example.client.Client
import example.factories.CutleryFactory
import example.factories.MetalFactory
import example.factories.WoodenFactory

class Demo {

    private fun clientChoice(): Client {
        val client: Client
        val factory: CutleryFactory
        val materialType = readLine()!!

        factory = if (materialType.contains("wood")) {
            WoodenFactory()
        } else {
            MetalFactory()
        }
        client = Client(factory)
        return client
    }

    fun main() {

        val client = clientChoice()
        client.polish()

    }

}