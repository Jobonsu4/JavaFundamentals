# If Statements Exercises

This directory contains exercises to help you practice writing if statements in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Basic If Statement
Write a method `checkAge(int age)` that returns `"Adult"` if the age is 18 or older, otherwise returns `"Minor"`.

### Exercise 2: Grade Classification
Write a method `classifyGrade(int score)` that returns:
- `"Excellent"` if score is 90 or above
- `"Good"` if score is 80-89
- `"Average"` if score is 70-79
- `"Below Average"` if score is below 70

### Exercise 3: Number Sign
Write a method `getSign(int number)` that returns:
- `"Positive"` if the number is greater than 0
- `"Zero"` if the number equals 0
- `"Negative"` if the number is less than 0

### Exercise 4: Temperature Check
Write a method `checkTemperature(double temp)` that returns:
- `"Hot"` if temperature is above 80°F
- `"Warm"` if temperature is between 60-80°F
- `"Cold"` if temperature is below 60°F

### Exercise 5: Login Validation
Write a method `validateLogin(String username, String password)` that returns `true` if both username and password are not null and not empty, otherwise returns `false`.

## Testing Your Code
After completing each exercise, test your methods with different inputs to make sure they work correctly:

```java
// Example tests
checkAge(17)    // Should return "Minor"
checkAge(18)    // Should return "Adult"
classifyGrade(95)  // Should return "Excellent"
getSign(-5)     // Should return "Negative"
```

## Tips
- Read the NOTES.md file first to understand if statements
- Test edge cases (like exactly 18 for age, or exactly 0 for numbers)
- Make sure your conditions cover all possible cases
- Use meaningful variable names in your conditions
