import java.time.LocalDateTime
import java.time.LocalDate

class Gigasecond(localDateTime : LocalDateTime) {
    constructor(localDate : LocalDate) : this(localDate.atStartOfDay())

    val date: LocalDateTime = localDateTime.plusSeconds(1_000_000_000)
}
