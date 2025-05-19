<?php
abstract class A
{
	abstract function b();
	
	public function c()
	{
		echo"We can use it <br>";
	}
}
class J extends A
{
	 public function b()
	 {
		echo "we are calling abstract class and method<br>";
	 }
}

$obj = new J();
$obj->c();
$obj->b();
?>

	  