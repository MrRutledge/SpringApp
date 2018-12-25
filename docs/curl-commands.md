
**Read Hello:**
```bash
curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello
```
**Add new pledge**
```bash
curl -i -H "Content-Type: application/json" -X POST -d '{
    "name": "Honest Harry",
     "statement": "I vote to change the world!"
     }' localhost:8080/pledges
```

**Add new pledge**
```bash
 curl -i -H "Content-Type: application/json" -X POST -d '{
     "name": "Honest Hill",
      "statement": "I vote to !"
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
        "name": "Little Lucy",
        "statement": "I vote for the future!"
    }' localhost:8080/pledges/2
```
**Change one pledge**
```bash
curl -i -H "Content-Type: application/json" -X POST -d '{
        "name": "Little Lucy",
        "statement": "I vote for the future!"
    }' localhost:8080/pledges/2
```