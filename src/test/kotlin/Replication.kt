import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Replication {

    @Test
    fun `Pass with default property`() {
        ThingWithProperty.SimpleThingWithProperty.shouldBe(ThingWithProperty.SimpleThingWithProperty)
    }

    @Test
    fun `Fail because of property override`() {
        ThingWithProperty.ThingWithOverriddenProperty.shouldBe(ThingWithProperty.ThingWithOverriddenProperty)
    }
}