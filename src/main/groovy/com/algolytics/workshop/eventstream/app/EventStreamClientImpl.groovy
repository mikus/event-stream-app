package com.algolytics.workshop.eventstream.app

import com.algolytics.workshop.eventstream.core.ClientProjection
import com.algolytics.workshop.eventstream.core.Event
import com.algolytics.workshop.eventstream.core.EventStreamClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EventStreamClientImpl implements EventStreamClient {

    @Autowired
    private ClientProjection clientProjection

    @Override
    public Event consume(Event event) {
        return clientProjection.consume(event)
    }
}
