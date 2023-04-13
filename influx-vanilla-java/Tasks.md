To Do Collection 

- Add in who paid for each expense and function to indicate who owes what to whom.
- Potentially adding unit tests.
- SplitWise app for design ideas.
- add more expenses for different amounts, same amounts, same members, diff members, different group. 
- what happens when you do something you shouldn't is null in the expense name or members, catch exceptions/ handle exceptions
- No need to initialize new lists in the constructor if you are not adding to them in the constructor
- 




Create a module that will help a group of people split shared expenses during a trip or vacation

1. Create a function to create a Trip  Group (Only one trip group will be created for the purpose of this exercise. So, this function will only be called once). Use console.log to show the json structure of the created group. The trip group name should be Jenny Austin.

2. Create a function to Add a member to the Trip group
    - This function can be called multiple times
    - Required validations may need to be done
    - use console.log to show the resultant trip group which should include the newly added member

3. Create a function to add expenses.
    - Expenses should always be added against a member
    - Can be called multiple times with different or same expense amounts and for different or same members
        - this suggests that each expense is added against members (plural!) meaning every time you add an expense you should indicate which members of the group are splitting this expense

4. Create a function to show the expenses split across the members
    - use console.log to show the final output
    - The output should clearly indicate who owes what amount to whom.

5. Create a main function to do the following
    - Calls the createTripGroup once
    - Calls the function to add 3 members
    - calls the function to add $30 as an expense for each of the members
    - calls the split function to show the final output