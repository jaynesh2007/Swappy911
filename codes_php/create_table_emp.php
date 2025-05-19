<?php

$servername ="localhost";
$username="root";
$password="";
$dbname="testDB";

$conn=mysqli_connect($servername,$username,$password,$dbname);
 
if(!$conn)
	{
		die("Connection failed:".mysqli_connect_error());
	}
echo"Connected successfully";

$sql="CREATE TABLE emp(emp_id INT(6) NOT NULL,emp_name VARCHAR(20) NOT NULL,emp_address VARCHAR(30) NOT NULL,emp_salary INT(8) NOT NULL,join_date date,primary key(emp_id))";

if(mysqli_query($conn,$sql))
	{
		echo"The table is created of employee successfully <br>";
	}
else
	{
		echo"Not created successfully <br>".mysqli_error($conn);
	}
	
mysqli_close($conn);
?>

