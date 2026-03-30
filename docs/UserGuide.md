# User Guide - Expense Search Feature

## Introduction

ExpensiveLeh is a CLI for managing your personal finances. Users can indicate their budget and add expenses into the app to track their budget situation. This guide documents the Expense data model and Search functionality.

## Quick Start

1. Ensure that you have Java 17 or above installed.
2. Download the latest version of `ExpensiveLeh` from the project repository.
3. Expenses are organized into categories: Food, Transport, Groceries, and Others.
4. Each expense contains a description, amount, and date.

## Features


### Searching for Expenses: `search`

Searches through all expenses to find items matching a keyword. The search is case-insensitive and looks through both the expense description and category.

Format: `search KEYWORD`

* The search is case-insensitive, so searching for "food" will match "Food"
* Partial matches are included (e.g., searching "joy" will find "Jollibee")
* Results are displayed in a formatted table with index, category, name, value, and date

Example of usage: 

`search jollibee`

ExpensiveLeh output:
```
________________________________________________________________
ExpensiveLeh says -> 
Search results for 'jollibee':
Index  Category     Name                 Value      Date
1      Food         Jollibee             $9.95      19-02-2026
________________________________________________________________
```

`search food`

ExpensiveLeh output:
```
________________________________________________________________
ExpensiveLeh says -> 
Search results for 'food':
Index  Category     Name                 Value      Date
1      Food         Jollibee             $9.95      19-02-2026
3      Food         McDonald's           $12.50     20-02-2026
________________________________________________________________
```

If no expenses match the keyword:

`search xyz`

ExpensiveLeh output:
```
________________________________________________________________
ExpensiveLeh says -> No expenses found with keyword: 'xyz'
________________________________________________________________
```

## FAQ

**Q**: Is the search case-sensitive?

**A**: No, the search function is case-insensitive. Searching for "food" or "FOOD" will return the same results.

**Q**: Can I search by category?

**A**: Yes, searching for category names like "food", "transport", "groceries", or "others" will return all expenses in that category.

**Q**: What if I search for a word that matches both description and category?

**A**: All matching expenses will be returned, whether they match the description or the category.

## Command Summary

* Search expenses: `search KEYWORD`
