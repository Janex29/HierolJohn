<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "hieroldb";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $first_name = $_POST['first_name'];
    $last_name = $_POST['last_name'];
    $age = $_POST['age'];
    $address = $_POST['address'];

    $sql = "INSERT INTO employees (first_name, last_name, age, address) VALUES ('$first_name', '$last_name', '$age', '$address')";

    if ($conn->query($sql) === TRUE) {
        header("Location: index.php");
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    $conn->close();
?>
