<?php
class A
{
	public function f1()
	{
		echo"We are printing message from class A <br>";
	}
}
trait B
{
	public function f2()
	{
		echo"We are printing message from class B<br>";
	}
}
class C extends A
{
	use B;
	public function f3()
	{
		echo "We are printing message from class C";
	}
}

$obj = new C();
$obj->f1();
$obj->f2();
$obj->f3();
?>
