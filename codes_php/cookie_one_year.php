<?php
$expiry=time()+(365*24*60*60);
setcookie("my_cookie","cookie_value",$expiry);
echo"Cookie is set for one year";
?>