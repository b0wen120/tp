
### <u>Ranking expenses</u>
Displays a visual bar chart ranking all your spending categories from highest to lowest.

**Format:** `rank expenses`

**Output:**
```text
  ExpensiveLeh says -> Here is your spending ranked by category:

  1. XXX            [$  300.00] ████████████████████
  2. YYY            [$  150.00] ██████████
  3. AAA            [$   75.00] █████
  4. BBB            [$   10.00] █
  ```
**Example:**

```text
  rank expenses
  
  ExpensiveLeh says -> Here is your spending ranked by category:

  1. Food            [$  300.00] ████████████████████
  2. Transport       [$  150.00] ██████████
  3. Groceries       [$   75.00] █████
  4. Others          [$   10.00] █
  ```


### <u>Editing a loan</u>
Edits an existing loan record in your loans list.
Format: edit loan INDEX [n/PERSON_NAME] [a/AMOUNT] [d/DATE]
* Edits the existing loan at the specified INDEX. The index refers to the index number shown in the displayed loans list.
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.

Output: Loan at index INDEX updated successfully!

Examples:
* edit loan 1 n/Jonathan a/55.00
* Loan at index 1 updated successfully!

### <u>Ranking loans</u>
Displays a visual bar chart ranking who owes you the most money, from highest to lowest.

**Format:** `rank loans`

**Output:** 
```text
  ExpensiveLeh says -> Here are your loans ranked by person:

  1. AAA            [$  300.00] ████████████████████
  2. BBB            [$  150.00] ██████████
  3. CCC            [$   75.00] █████
  4. DDD            [$   10.00] █
  ```
**Example:** 
```text
  rank loans
  
  ExpensiveLeh says -> Here are your loans ranked by person:

  1. Ali            [$  300.00] ████████████████████
  2. Bob            [$  150.00] ██████████
  3. Eli            [$   75.00] █████
  4. Lex            [$   10.00] █
  ```

### <u>Exit</u>
Exits the program.

FORMAT: exit