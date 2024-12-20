export class ZebraPuzzle {

  constructor() {
    this.houses = [
      { color: 'yellow', nationality: 'Norwegian', drink: 'water', smoke: 'Kools', pet: 'fox' },
      { color: 'blue', nationality: 'Ukrainian', drink: 'tea', smoke: 'Chesterfields', pet: 'horse' },
      { color: 'red', nationality: 'Englishman', drink: 'Milk', smoke: 'Old Gold', pet: 'snails' },
      { color: 'green', nationality: 'Japanese', drink: 'coffee', smoke: 'Parliaments', pet: 'zebra' },
      { color: 'ivory', nationality: 'Spaniard', drink: 'orange juice', smoke: 'Lucky Strike', pet: 'dog' },
    ];
  }

  waterDrinker() {
    return this.houses.find(house => house.drink === 'water').nationality;
  }

  zebraOwner() {
    return this.houses.find(house => house.pet === 'zebra').nationality;
  }
}
