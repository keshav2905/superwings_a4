<?php 

function calculateCharges(int $distance) {

    $charges = 0;

    while($distance > 15) {
        $charges = $charges + 15;
        $distance = $distance - 1;
    }

    while($distance > 5) {
        $charges = $charges + 18;
        $distance = $distance - 1;
    }

    while($distance > 2) {
        $charges = $charges + 20;
        $distance = $distance - 1;
    }

    $charges = $charges + 50;

    return $charges;
}

$distance = 16;

echo "Total Charges for distance " . $distance . " KM.: " . calculateCharges($distance);

?>