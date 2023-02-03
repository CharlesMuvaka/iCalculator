package datamanager

import models.Event

class EventsDataManager {
    var allEvents = ArrayList<Event>()
    init {
        getAllEvents()
    }

    private fun getAllEvents() {
        var event = Event("Orphanage visiting")
        event.apply {
            descritpion = ""
        }
        allEvents.add(event)

        var event1 = Event("Equity Football team hosts Bandari")
        event.apply {
            descritpion = ""
        }
        allEvents.add(event1)

        var event2 = Event("Career talk session")
        event.apply {
            descritpion = ""
        }
        allEvents.add(event2)
    }
}