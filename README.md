![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | BLOG - User Registration

## A Quick Introduction





## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Go through the instructions carefully.***
2. ***Do not modify the entire code.***
3. ***Edit the code as per the instructions.***
4. ***Go to Java Resources -> src folder.***
5. ***You will have 3 packages src/controller, src/model and src/businesslogic.***
6. ***Create Classes inside the model package***
7. ***Once the progressions are completed follow the instructions to run the application and test your code.***
 
## Run the Project
1. ***Right - click on the project.***
2. ***Go to Run as -> Run on server.***
3. ***You can check the output in eclipse browser or in your browser.***

## Testing
1. ***Uncomment the code inside Java Resources - src -testing - TestFlamesCheckService class file.***
2. ***Right - click on the project***
3. ***Go to Run as -> Junit Test.*** 
4. ***All the testcases must be evaluated.***

## Input Format
1. ***There are 3 inputs***
2. ***First input is a String which corresponds to email.***
3. ***Second input is a String which corresponds to password.***
4. ***Third input is a String which corresponds to confirm password.***

## Output Format
1. ***Output is a boolean value which returns true or false based on registration***


## Progression - 1 
1. ***Create a class called User inside the model package with the following arguments***
   - ***String name***
   - ***int email***
   - ***LocalDate date***
2. ***Generate appropriate getters and setters.***
3. ***Generate a 3 argument constructor in the User class.***

## Progression - 2
1. ***Create a class called RegistrationValidation with the following methods***
   - ***public boolean checkUserDetails(String email,String password,String confirmPassword)*** 
   - ***private boolean validPassword(String password, String confirmPassword)***
   - ***private boolean validEmail(String email)***
2. ***CheckUserDetails should invoke two methods validPassword and validEmail.
3. ***Email should pass the following validations***
   - ***Email can contain alphanumeric value***
   - ***Only special characters - _, @, .[at, underscore, dot]***
   - ***Email should not be empty.***
4. ***Password should pass the following constraints***
   - ***Password field should not be empty.***
   - ***Password and confirm password should match.***
   - ***Must contain atleast 8 characters and atmost 20 characters.***
   - ***Must have atleast one uppercase,1 lowercase,1 number.***

## PROGRESSION - 7
1. ***Create an object for RegistrationValidation in the SignUpController class located inside JAVA Resources - src/controller***
2. ***Call the checkUserDetails method with the object created***

## Bonus
1. ***Write the validation code without using regex.***



Happy Coding ProGrad ❤️

