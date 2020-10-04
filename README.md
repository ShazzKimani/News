# NEWS

## Description
This is an API designed to allow users various abilities ie view users ,departments,general news etc.

## Setup/Installation Requirements
* To use this project, clone it.
https://github.com/ShazzKimani/News.git

## Database setup
- CREATE DATABASE organizational_api;

- \c organizational_api

- CREATE TABLE users (id SERIAL PRIMARY KEY,name varchar,companyposition varchar,role varchar,departmentid INTEGER);

- CREATE TABLE departments(id SERIAL PRIMARY KEY,name varchar,description varchar);

- CREATE TABLE news(id SERIAL PRIMARY KEY,content varchar,userid INTEGER,departmentid INTEGER,type varchar);


## Technologies Used
* Java
* Heroku
* Gradle
* Postgresql


## Paths

| Path                           | Action                                           |
| ---                            | ---                                              |
| /users                         | Shows all users                                  |
| /departments                   | shows all departments                            |
| /departments/:id               | shows specific department                        |
| /users/:id                     | shows specific user                              |

## Live link

* https://organisation001-api.herokuapp.com

## Support and contact details
Email me at sharonkimani01@gmail.com for any questions concerning the app. Feel fre
### License
* The MIT License (MIT)
  
  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
  
  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
  
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
  
  Copyright (c) 2020 Sharon Kimani