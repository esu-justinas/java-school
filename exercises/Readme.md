# Task 1 - New Project Initialization

1. Create new project using Spring Boot Initializr (https://start.spring.io/) with these Dependencies selected:
   1. Spring Web
   2. Lombok
   3. Spring Data JPA
   4. H2 Database
2. Create two new endpoints:
   1. POST api/mechanic which will accept requests with such body:
       
          {
              "name": "Vardenis",
              "surname": "Pavardenis"
          }

       And will create a new entity in a table called "Mechanic", with three columns: id (primary key), name, surname.
       After entity is created this endpoint should return response with such json body and 200 HTTP code:

          {
              "id": <id of DB entity>
              "name": "Vardenis",
              "surname": "Pavardenis"
          }
   2. GET /api/mechanic/{id} , where instead of {id}. You can put id of existing mechanic entity from DB and this endpoint should return json object of that entity looking like this, with 200 HTTP code:

          {
              "id": <id of DB entity>
              "name": "Vardenis",
              "surname": "Pavardenis"
          }
      If there is no entity with requested id, then this endpoint should return HTTP code 404.

For now use H2 database in this project. Feel free to use any AI tool to help you out. But make sure you understand each code line you write. If you don't understand something ASK AI or GOOGLE!