**Find:**

* Some Io example problems
  http://www.iolanguage.com/about/samplecode/

* An Io community that will answer questions
  irc://irc.freenode.net/io
  http://tech.groups.yahoo.com/group/iolanguage/

* A style guide with Io idioms
  http://en.wikibooks.org/wiki/Io_Programming/Io_Style_Guide

**Answer:**

* Evaluate 1 + 1 and then 1 + "one". Is Io strongly typed or weakly
typed? Support your answer with code.
  > Strongly typed. Every message is sent to a receiver. A receiver
  either understands a message or it does not. Since Io is a prototype
  language, I think strong vs. weak typing is not a perfect fit.

* Is 0 true or false? What about the empty string? Is nil true or
  false? Support your answer with code.
  `true and 0` => `true`
  `true and ""` => `true`
  `true and nil` => `false`

* How can you tell what slots a prototype supports?
  `obj proto slotNames`

* What is the difference between = (equals), := (colon equals), and ::= (colon colon equals)? When would you use each one?
  > `=` is sugar for updateSlot. If a slot does not exist, an error is thrown
  `:=` is sugar for setSlot. It creates a slot if it doesn't exist and
  sets the value.
  `::=` is sugar for createSlot. It creates a slot if it doesn't exist
  sets the value and creates a setter method
  Example:
    Io> obj := Object clone
    ==>  Object_0x1005c0ef0:
    
    Io> obj a ::= 1
    ==> 1
    Io> obj b := 2
    ==> 2
    Io> obj c = 3
    
      Exception: Slot c not found. Must define slot using := operator before updating.
        ---------
          message 'updateSlot' in 'Command Line' on line 1
    
    Io> obj b = 4
    ==> 4
    Io> obj
    ==>  Object_0x1005c0ef0:
      a                = 1
      b                = 4
      setA             = method(...)

**Do:**

* Run an Io program from a file. 
  `io hello.io`

* Execute the code in a slot given its name.
  `ferrari getSlot("drive") call`
