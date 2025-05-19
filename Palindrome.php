<?php
function isPar($input)
{
	$str=(string)$input;
	$reserved=strrev($str);
	 return $str===$reserved;
}
$number=121;
$string="madam";

if(isPar($number))
{	
	echo"The number $number is Palindrome  <br>";
}
else
{
	echo"The number  $number not is Palindrome";
}

if(isPar($string))
{
	echo"The is string is  Palindrome: $string  <br> ";
}
else 
{
	echo"The string is not Palindrome $string";
}
?>
	