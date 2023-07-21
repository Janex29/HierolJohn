<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "hieroldb";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $sql = "SELECT * FROM employees";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo '<div class="output-container">';
        echo "<h2>Employees:</h2>";
        echo "<ul class='employee-list'>";

        while ($row = $result->fetch_assoc()) {
            echo "<li><strong>Name:</strong> {$row['first_name']} {$row['last_name']}<br>";
            echo "<strong>Age:</strong> {$row['age']}<br>";
            echo "<strong>Address:</strong> {$row['address']}</li>";
            echo "<hr>";
        }

        echo "</ul>";
        echo '</div>';
    } else {
        echo "No employees found.";
    }

    $conn->close();
?>
