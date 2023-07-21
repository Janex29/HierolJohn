<!DOCTYPE html>
<html>
<head>
    <title>Employee Management System</title>
    <link rel="stylesheet" href="style.css">
    <style>
        .title-container {
            text-align: center;
        }

        .output-container {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="title-container">
        <h1>Employee Management System</h1>
    </div>

    <div class="output-container">
        <form action="add_employee.php" method="post">
            <label>First Name:</label>
            <input type="text" name="first_name" required>
            <br>

            <label>Last Name:</label>
            <input type="text" name="last_name" required>
            <br>

            <label>Age:</label>
            <input type="number" name="age" required>
            <br>

            <label>Address:</label>
            <input type="text" name="address" required>
            <br>

            <input type="submit" value="Add Employee">
        </form>

        <?php
            include 'display.php';
        ?>
    </div>
</body>
</html>
