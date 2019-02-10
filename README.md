## SpringApp API

 API to encourage potential voters to register and pledge to vote. The API is built using Spring boot framework and 
 gradle.
 
 #### Tools
 **SpringBoot:** 1.5.10.\
 **Gradle:**  5.0\
 **IntelliJ**\
 **Java:** 8
 
 #### Get and Post commands to try out
 
 **Read Hello:**
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