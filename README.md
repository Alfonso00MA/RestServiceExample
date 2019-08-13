# RestServiceExample

script.sql file contains the database structure creation script.

Curl example requests to test:

curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/author --data '{"name":"Author 1 Name","sex":"M"}'

curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/book --data '{"title":"Book 1 title ","isbn":"123456","author":{"id":20}}'

curl -X GET -H 'Content-Type: application/json' -i http://localhost:8080/book/21
