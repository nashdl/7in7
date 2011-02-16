* Write a program to find the nth Fibonacci number. fib(1) is 1, and fib(4) is 4. As a bonus, solve the problems with recursion and loops.

	fib := method(n,
		current := 0;
		successor := 1;
		for(i, 2, n, 1,
			tmp := current;
			current = successor;
			successor = tmp + successor;
		)
		return successor
	)

* How would you change / to return 0 if the demoninator is zero?

	Number div := Number getSlot("/")

	Number / := method(n, if(n==0, 0, self div(n)))

* Write a program to add up all of the numbers in a 2-d array.

	List superSum := method(
		flatList := self flatten;
		flatList sum
	)

* Add a slot called myAverage to a list that computes the average of all the numbers in a list. 

	List myAverage := method(
		mySum := self sum;
		mySize := self size;
		mySum / mySize)

* What happens if there are no numbers in a list.

	Io> list myAverage

	  Exception: nil does not respond to '/'
	  ---------
	  nil /                                Command Line 1
	  List myAverage                       Command Line 1

* Bonus: Raise an Io exception if any item in the list is not a number.

List myAverage := method(
	mySize := self size;
	e := try(
		mySum := self sum;
	);
	e catch(Exception, Exception raise("Not all variables are numbers!"));
	mySum / mySize
)

* Write a prototype for a 2-d list. The dim(x,y) method should allocate a list of y lists that are x elements long, set(x, y, value) should set a value and get(x, y) should return that value.

SuperList := Object clone
SuperList l := list
SuperList dim := method(x, y,
	self l = list
	for(i, 0, y, 1,
		sub_list := list;
		for(j, 0, x, 1,
			sub_list append(j)
		);
		self l append(sub_list)
	)
)
SuperList set := method(x, y,
	
