package com.alaxat.mountlight

import spock.lang.Specification

class PhoneFilterTest extends Specification {

    def "Filter orders"() {
        when:
        PhoneFilter phoneFilter = new PhoneFilter()
        List<Order> orders = Arrays.asList(new Order().setName("Android phone"), new Order().setName("Apple phone"))
        orders = phoneFilter.filter(orders)
        then:
        orders.get(0).name == 'Android phone'
    }
}
