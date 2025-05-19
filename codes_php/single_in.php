<?php
class A
{
	public function f1()
	{
		echo " we are printing message from parent class <br>";
	}
}
class B extends A
{
	public function f2()
	{
		echo "We are printing message from child class";
	}
}

$obj = new B();
$obj->f1();
$obj->f2();
?>