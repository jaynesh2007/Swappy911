<?php
class Parent_Class 
{
    public static $count = 0;

    public static function sayHello() 
	{
        echo "Hello from static method<br>";
    }

    public static function incrementCount() 
	{
        static::$count++;  // Using static:: instead of self::
        echo "Count is: " . static::$count . "<br>";
    }

    public static function whoAmI() 
	{
        echo "Called from class: " . static::class . "<br>";
    }
}

class Child_Class extends Parent_Class 
{
    // Inherits everything
}

Parent_Class::sayHello();              // Calls static method
Parent_Class::incrementCount();        // Count = 1
Parent_Class::incrementCount();        // Count = 2

Child_Class::incrementCount();     // Count = 3 (shared in this case)
Child_Class::whoAmI();             // Late static binding → ChildClass
Parent_Class::whoAmI();                // → MyClass
?>
