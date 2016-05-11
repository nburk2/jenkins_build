package jenkum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "people must have names"() {
        given:"a person with no name"
            def p = new Person()

        expect:"instance should not validate"
          !p.validate()
    }
}
