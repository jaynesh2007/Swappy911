<?php
class Myclass
{
	public $roll;
	public $name;
	
	public function f1($name,$roll)
	{
		$this->roll = $roll;
		$this->name = $name;
		echo"We are printing name:" . $this->name . "  and roll number  ". $this->roll."<br>";
	}
}
$student = new Myclass();
$student->f1("Jaynesh",101);
// we are clonning object
$stud = clone $student;
$stud->f1("Jay",102);
?>
