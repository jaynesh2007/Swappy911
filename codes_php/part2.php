<html>

<body>
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
echo"Connected successfully <br>";

$eid = $_REQUEST['emp_id'];
$ename = $_REQUEST['emp_name'];
$address = $_REQUEST['emp_address'];
$salary = $_REQUEST['emp_salary'];
$jdate = $_REQUEST['join_date'];

$sql="INSERT INTO emp ( emp_id, emp_name , emp_address , emp_salary ,join_date) VALUES ( '$eid' , '$ename' , '$address' , '$salary' ,'$jdate')";

if(mysqli_query($conn,$sql))
	{
		echo" Data is stored successfully: ";
	}
else
	{
		echo"Erro".mysqli_error($conn);
	}
mysqli_close($conn);

?>
</body>
</html>
 