package no.jansoren.mymicroservice.somethingelse;

import no.jansoren.mymicroservice.eventsourcing.Event;

public class SomethingElseDoneEvent extends Event {
    @Override
    public String getDescription() {
        return "Something else has been done";
    }
}
