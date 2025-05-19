	<html>
	<body>
	<center>

	<h1> Employee Res From </h1>

	<form action="part2.php" method="POST">
	<p>
	<label for="eno">Employee ID: </label>
	<input type="number" id="eid" name="emp_id">
	</p>
	<label for="ename">Employee Name: </label>
	<input type="text" id="ename" name="emp_name">
	<p>
	<label for="address">Employee Address: </label>
	<input type="text" id="address" name="emp_address">
	</p>
	<label for="salary" >Employee Salary</label>
	<input type="number" id="salary" name="emp_salary">
	<p>
	<label for="jdate"> Join date: </label>
	<input type="date" id="jdate" name="join_date">
	</p>
	<input type="submit" value="Submit">
	</form>
	</center>
	</body>
	</html>