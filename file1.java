echo "Please enter your pin"
read pin 
if [ $pin -eq 5470 ]
then 
echo 'You entered a valid pin'
echo 'Welcome to TD, how can we help you'
else 
echo "Sorry, your pin is invalid. Please contact a branch."
fi 
