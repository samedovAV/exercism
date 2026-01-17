// Package weather provides tools for reporting the current weather
// conditions for cities in Goblinocus. It keeps track of the most
// recently forecasted location and its weather condition.
package weather

var (
	// CurrentCondition stores the latest known weather condition
	// (for example: "sunny", "rainy", or "cloudy") for the most
	// recently forecasted city.
	CurrentCondition string

	// CurrentLocation stores the name of the city for which the
	// current weather condition was most recently forecasted.
	CurrentLocation  string
)

// Forecast updates the current weather information for a given city
// and returns a human-readable weather report describing the city's
// current weather condition.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
