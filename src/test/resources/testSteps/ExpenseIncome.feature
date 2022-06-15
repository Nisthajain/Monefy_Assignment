Feature: ExpenseIncome
Description: CRUD Operations on Expenses and Income | Tranfer the payment

Background:
	Given user launches the application

Scenario Outline: Adding Expenses
	Given user clicks on Expense button to add expense
	When User enters the "<Amount>" and chooses the category
	Then Date should br displayed on the pie chart
Examples:
|Amount|
|500|

Scenario Outline: Adding Income
	Given user clicks on Income button to add Income
	When User enters the "<Amount>" and chooses the category
	Then Date should br displayed on the pie chart
Examples:
|Amount|
|300|

Scenario Outline: Transfer Cash
	When user clicks on transferIcon
	When user clicks on the dropdown1
	When user clicks on the dropdown2
  When user added the note text
	Then verify that the transferred amount is shown or not 
Examples:
|Amount|
| 600  |