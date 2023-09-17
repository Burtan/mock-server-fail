import io.kotest.core.spec.style.StringSpec
import io.kotest.extensions.mockserver.MockServerListener

class MyMockServerTest : StringSpec() {
    init {

        // this attaches the server to the lifeycle of the spec
        listener(MockServerListener(1080))

        "disabled test fails".config(enabled = false) {  }
    }
}
