<?php
class A
{
	public function cars()
	{
		echo"We are printing message from A and we are using overriding";
	}
}
class B extends A
{
	public function cars()
	{
		echo"We are printing message From B and we are using overriding";
	}
}

$obj = new B();
$obj->cars();
?>