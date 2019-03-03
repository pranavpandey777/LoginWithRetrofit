# API Documentation

Base Url--https://form420.000webhostapp.com/


1. Login API:
End Point:
Login
Method Type:
POST
Content Type:
Application/json
Data Structure:
{"email":"example@gmail.com","password":"example"}
Response:
For Success:
"status": 1,
"status_message": "Valid User"
For Failure:
"status": 2,
"status_message": "Invalid User"


2. Registration API:
End Point:
adduser
Method Type:
POST
Content Type:
Application/json
Data Structure:
{"name": "Ankit Raina","email": "ankit@gmail.com",
"mobile": "9875562545","password": "123456"}
Response:
For Success:
“status”:1
" status_message ": “Employee Added Successfully”
For Failure:
“status”:0
" status_message ": “Employee Addition Failed”


3.All Data API:
End Point:
getusers
Method Type:
GET
Response:
{
"Data": [
{
"name": "Ankit Raina",
"email": "ankit@gmail.com",
"mobile": "9875562545",
"password": "123456"
}
]
}


4.Get Single User API:
End Point:
getone
Method Type:
GET
Data Structure:
QUERY
https://form420.000webhostapp.com/getone/{email}
Response:
{
"name": "Ankit Raina",
"email": "ankit@gmail.com",
"mobile": "9875562545",
"password": "123456"
}


5.Delete User API:
End Point:
deleteuser
Method Type:
GET
Data Structure:
QUERY
https://form420.000webhostapp.com/deleteuser/{email}
Response:
For Success:
“status”:1
" status_message ": “Employee Deleted Successfully”
For Failure:
“status”:0
" status_message ": “Employee Deletion Failed”
6.Update API:
End Point:
update
Method Type:
POST
Content Type:
Query
https://form420.000webhostapp.com/update/{email}
Application/json
Data Structure:
{"name": "Ankit Raina","email": "ankit@gmail.com",
"mobile": "9875562545","password": "123456"}
Response:
For Success:
“status”:1
" status_message ": “Employee Updated Successfully”
For Failure:
“status”:0
" status_message ": “Employee Updation Failed”
