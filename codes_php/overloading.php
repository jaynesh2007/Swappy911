<?php
class MyClass 
	{
		public function __call($name, $arguments) 	
		{
			echo "You called '$name' with " . count($arguments) . " argument(s).<br>";
        }
}

$obj = new MyClass();
$obj->hello();              // 0 arguments
$obj->hello("Jaynesh");     // 1 argument
$obj->hello("Jay", 101);    // 2 arguments
?>
