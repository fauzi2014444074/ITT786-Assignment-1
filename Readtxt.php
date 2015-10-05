<?php
$myFile = "C:/Users/Fortesys/Desktop/AhmadFauzi.txt";
$fh = fopen($myFile, 'r')or die("Unable to open file!");
$theData = fread($fh,filesize($myFile));
fclose($fh);
echo $theData;