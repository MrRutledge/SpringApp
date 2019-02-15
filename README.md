## SpringApp API

 API to encourage potential voters to register and pledge to vote. The API is built using Spring boot framework and 
 gradle. Clone the repo and play with it to see how it works, run it in your favorite IDE, test it with the requests below.
 
 #### Tools
 *SpringBoot:* 1.5.10.\
 *Gradle:*  5.0\
 *Java:* 8
 
 #### Get and Post requests to try out in your bash terminal 
 
 **Read Hello**
 ```bash
 curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello
 ```
 **Add new pledge**
 ```bash
 curl -i -H "Content-Type: application/json" -X POST -d '{
     "name": "Random Guy",
      "statement": "I vote to change the world!"
      }' localhost:8080/pledges
 ```
 
 **Add new pledge**
 ```bash
  curl -i -H "Content-Type: application/json" -X POST -d '{
      "name": "Honest Hill",
       "statement": "I vote to the system !"
       }' localhost:8080/pledges
  ```
 
 **List all pledges**
 ```bash
 curl -i -H "Content-Type: application/json" \
     -X GET localhost:8080/pledges
 ```
     
 
 **Get one Pledge**
 ```bash
 curl -i -H "Content-Type: application/json" \
     -X GET localhost:8080/pledges/2
 ```
 
 **Change one pledge**
 ```bash
 curl -i -H "Content-Type: application/json" -X POST -d '{
         "name": "Little Pray",
         "statement": "I vote for the future!"
     }' localhost:8080/pledges/2
 ```
 
 #### Possible usage
 We can build a web app with similar functionality, just add a UI with a bit more functions and we get ourselves an app.  
 
 **_Reference_**: Dr. B Fraser, Spring with Intellij. www.youtube.com/watch?v=he63dwZdhO