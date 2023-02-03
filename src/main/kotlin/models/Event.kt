package models

import java.util.Date

data class Event(val title: String) {
    var descritpion: String? = null
    var eventDate: Date? = null
    var eventImage: String? = null
}