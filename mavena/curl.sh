#bin/bash

echo "login -----"
curl -H "Content-Type:application/json" -X POST -d '{"first_name":"RUTH","password":"MARTINEZ"}' localhost:8080/login
echo "query by page---"
curl localhost:8080/?page=1\&pagesize=10\&sort=asc

echo  "put----"
curl -H "Content-Type:application/json"  -X PUT -d '{"staff_id":45,"first_name":"llast","last_name":"gt","email":"gt@126.COM","address_id": 2,"store_id": 1,"username": "ss"}' localhost:8080/?address=1215%20Pyongyang%20Parkway
curl -H "Content-Type:application/json"  -X POST -d '{"staff_id":45,"first_name":"llast","last_name":"gt","email":"gt@126.COM","address_id": 2,"store_id": 1,"username": "ss"}' localhost:8080/
curl -H "Content-Type:application/json"  -X DELETE -d '{"staff_id":45}' localhost:8080/