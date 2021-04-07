package junit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SucceedingJunitTest {

    @Test
    fun addition() {
        Assertions.assertEquals(2, 1 + 1)
    }

}
