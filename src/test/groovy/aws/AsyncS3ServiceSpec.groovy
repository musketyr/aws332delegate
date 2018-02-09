package aws

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification
import spock.util.concurrent.BlockingVariable

class AsyncS3ServiceSpec extends Specification implements ServiceUnitTest<AsyncS3Service>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        when:
            BlockingVariable<Throwable> th = new BlockingVariable<>()
            service.deleteFile('doesNotExist').onError {
                th.set(it)
            }
        then:
            th.get()
            th.get().message == 'java.lang.NullPointerException: Cannot invoke method deleteFile() on null object'
    }
}
