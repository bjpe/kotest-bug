package kotest

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class FailingKotestTest : DescribeSpec({
    describe("addition") {
        it("should add two numbers") {
            1 + 1 shouldBe 1
        }
    }
})
