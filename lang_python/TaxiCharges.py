# Taxi Charges

def calculateCharges(distance):

    charges = 0

    while distance > 15:
        charges = charges + 15
        distance = distance - 1

    while distance > 5:
        charges = charges + 18
        distance = distance - 1

    while distance > 2:
        charges = charges + 20
        distance = distance - 1

    charges = charges + 50

    return charges



distance = int(input('Enter distance in KM.: '))
print('Total Charges: ', calculateCharges(distance))