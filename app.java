if condition
then
Display commands list if condition is true.
else
Display commands list if condition is false.
fi

echo "Please enter your price"
read p
if [ $p == 2000 ]
then 
echo "The price is good for the business"
echo "Please deliver the product"
fi 
