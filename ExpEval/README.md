Expression Evaluator
==========


configuration 
-------------
Extract the "expression-evaluator.zip".
Set the environment variable with the name of 'EVALUATOR_HOME'.
Use shell file to run evaluator.

   
Release 0.1
--------------

It will add two positive integer numbers ;

Space is mandatory between operator and operand;

Brackets are not allowed .

`Example - jk_ExpEval.sh "4 + 5" `

this will give ans : 9

Release 0.2
--------------

It will add , substract ,multiply ,divide two integer numbers ;

Space is mandatory between operator and operand;

Brackets are not allowed .

Negative numbers are allowed.

Exponent should be positive;

for Exclusive operation it will calculate result upto 32 bit ie. 10 digits.

`Example - jk_ExpEval.sh "4 + 5"        output : 9.5`

`Example - jk_ExpEval.sh "4 - 5"        output : -1`

`Example - jk_ExpEval.sh "1 * -3"        output : -3`

`Example - jk_ExpEval.sh "51 / 5"        output : 10.2`

`Example - jk_ExpEval.sh "4 ^ 5"        output : 1024`
