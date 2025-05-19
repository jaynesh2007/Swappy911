<?php
 
$servername="localhost";
$username="root";
$password="";
$dbname="testDB";

$conn=mysqli_connect($servername,$username,$password,$dbname);

if(!$conn)
	{
		die("Connection failed:".mysqli_connect_error());
	}
echo"Connted successfully";

$sql="UPDATE emp SET emp_address='Dehli' WHERE emp_id='101'";

if(mysqli_query($conn,$sql))
	{
		echo"The record is update successfully<br>";
	}
else
	{
		echo"Error".mysqli_error($conn)."<br>";
	}

mysqli_close($conn);
