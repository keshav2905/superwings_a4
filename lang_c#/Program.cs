int calculateCharges(int distance) {

    int charges = 0;

    while(distance > 15) {
        charges = charges + 15;
        distance = distance - 1;
    }

    while(distance > 5) {
        charges = charges + 18;
        distance = distance - 1;
    }

    while(distance > 2) {
        charges = charges + 20;
        distance = distance - 1;
    }

    charges= charges + 50;

    return charges;
}


int distance;
Console.WriteLine("Enter distance in KM.: ");
distance = int.Parse(Console.ReadLine());

Console.WriteLine("Total Charges: " + calculateCharges(distance));
