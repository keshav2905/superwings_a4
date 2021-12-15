function calculateCharges(distance: number) {
  let charges: number = 0;

  while (distance > 15) {
    charges += 15;
    distance--;
  }

  while (distance > 5) {
    charges += 18;
    distance--;
  }

  while (distance > 2) {
    charges += 20;
    distance--;
  }

  charges += 50;

  return charges;
}

let distance: number = 16;
console.log(
  "Total Chagers For " + distance + "KM.: " + calculateCharges(distance)
);
