** Resources **

io Wiki
- http://en.wikibooks.org/wiki/Programming:Io

io Guide
- http://www.iolanguage.com/scm/io/docs/IoGuide.html

* Evaluate 1+1 and then 1 + "one". Is Io strongly typed or weakly typed? Support your answer with code.


	Io> 1+1
	==> 2
	Io> 1+"one"

	  Exception: argument 0 to method '+' must be a Number, not a 'Sequence'
		---------
		  message '+' in 'Command Line' on line 1

		  Io> 

	Io> 1 type
	==> Number
	Io> "one" type
	==> Sequence

> Io leans towards being strongly typed. However, it does allow some type conversions. 
> You can, for example, concatenate a Sequence and a Number.
> Is it possible that Io would be considered duck typed?

	Io> a := "one" .. 1
	==> one1
	Io> a type
	==> Sequence

* Is 0 true or false? What about the empty string? Is nil true or false? Support your answer with code.

	Io> true and 0
	==> true
	Io> if (0) then (writeln("0 is true")) else (writeln("0 is false"))
	0 is true
	==> nil

	Io> true and ""
	==> true
	Io> if ("") then (writeln("An empty string is true."))
	An empty string is true.

	Io> true and nil
	==> false
	Io> if (nil) then (writeln("nil is true")) else (writeln("nil is false"))
	nil is false
	==> nil

* How can you tell what slots a prototype supports?

> Use slotNames.
	Io> Number slotNames
	==> list(asHex, shortMax, factorial [....]

> You can also use slotSummary
	Io> Number slotSummary
	==>  0:
	%                = Number_%()
	&                = Number_&()
	*                = Number_*()
	**               = Number_**()
	.......

* What is the difference between = and := and ::=? When would you use each one?

	Via http://www.iolanguage.com/scm/io/docs/IoGuide.html#Syntax-Assignment
	::=	 Creates slot, creates setter, assigns value
	 This might be used when you want to create a setter to change the slot.
	:=	 Creates slot, assigns value
	 Useful for assigning values to slots and creating them if they don't yet exist.
	=	 Assigns value to slot if it exists, otherwise raises exception
	 Helps you avoid setting undeclared variables.

* Run an Io program from a file.

	io runme.io

* Execute the code in a slot given its name.

	Io> Lobby getSlot("exit") call
