<?php

$servername="localhost";
$username="root";
$password="";
$dbname="testDB";

$conn=mysqli_connect($servername,$username,$password,$dbname);

if(!$conn)
	{
		die("Connection failed".mysqli_connect_error());
	}
$sql="DELETE FROM emp WHERE emp_id=101";

if(mysqli_query($conn,$sql))
	{
		echo"Record deleted successfully";
	}
else
	{
		echo"Erro:".mysqli_error($conn);
	}
mysqli_close($conn);
?>