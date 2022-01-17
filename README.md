# Help Santa

# Problem Statement

Helping Santa... 
Christmas is coming and our company has received a strange inquiry from Santa inc. to help them with hood preparation.  
As a renowned society, Santa inc. owns numerous fleets ensuring proper delivery of presents for Christmas. Lots of hoods must be prepared for this special night. Several present (different lines of product having different weight) are built in their workshop ensuring continuous and infinite flow of gifts. Each hood has a different load capacity and must be filled up exactly with the appropriate number of present weights. Santa’s elfs are getting older, and unlike their direct concurrent ZonAma, care toward their employee is taken; thus, it is requested that each hood should be filled up with the minimum item number to preserve elven back. 
Powered by a strong cloud infrastructure, Santa inc. needs a new REST endpoint which will help them determine the number of toys per hood. Your duty, as a skilled developer, will be to implement this mechanism as a micro micro service in java / kotlin and make it as production ready as possible. Framework, helpers, etc is your own choice. 
The expected endpoint is a /hoodfiller url, accepting a POST request. This request will push a JSON having two parameters: 
 
{ 
  "hood_capacity": 41, 
  "present_weights": [2, 5, 10, 50, 100] 
} 
 
The first one is the capacity available (and to reach exactly) for a specific hood, the second one is the list of weight per type of present. Here we are trying to fill up a hood of capacity 41 with a set of gifts weighing 2, 5, 10, 50 or 100. 
The API should return a list of present weights to prepare the hood minimizing the number of items. (eg: [10, 10, 10, 5, 2, 2, 2]. The technical side of the answer is your responsibility and must consider all elven (mis ?) manipulation. 
 
Bonus: Santa inc. uses docker for its deployment; a dockerfile generating a container embedding the endpoint will ease their work. 

# Solution

This is an spring boot project developed witht java

# BUILD and RUN

Download this project in git or as an zip file.
Run maven command to get the dependencies.
Once done run this class manually as java application **"com.java.knapsack.utils.Application.java"**
Check the console for application statrt up, for successful start will get "**Tomcat started on port(s): 8080 (http)** with context path ''"

# Testing

In browser open the below URL after application start up successfully

http://localhost:8080/swagger-ui/index.html

Select the /help api and click try it out button.
give the below sample value for the help api and click execute method

Sample Input:

{
  "hood_capacity": 32,
  "present_weights": [
    299,67,11,1,5,7
  ]
}

Verify the output (for above input we get below output)
[11, 11, 7, 1, 1, 1]
