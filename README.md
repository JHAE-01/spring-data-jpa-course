# spring-data-jpa-course
## SPRING_DATA_JPA_BASICS by daily code buffer

### Learnt Jpa Concepts like;
#### One to one relationship
#### Many to one relationship
#### One to many relationship
#### Many to many relationship
#### JPQL queries and Native queries
#### Paging and sorting


##### Database design diagram
![DataJpa 2022-10-04 041634](https://user-images.githubusercontent.com/78834275/193816065-2381718d-2228-4465-a92a-30cf8061d136.png)


##### Image showing one to one  relationship;bidirectional, between course and course_material class
![bid c n cm one ton one 2022-10-04 042829](https://user-images.githubusercontent.com/78834275/193814861-d7693e45-49ad-4cb8-9cf0-be61e1a116ce.png)

##### Image showing many to one  relationship, between course and teacher in the course class, as "many to one" is more adviced to be used over "one to many"
![MAN TO ONE TICHA N CORSE 2022-10-04 043051](https://user-images.githubusercontent.com/78834275/193815918-01d2582a-b3d0-4396-b641-6641f1b65ded.png)

### Native Queries and JPQl
![JPQL 2022-10-04 042042](https://user-images.githubusercontent.com/78834275/193815897-b0e49c11-619f-416c-8178-97f6e6bb4d61.png)
![nativeQL 2022-10-04 041905](https://user-images.githubusercontent.com/78834275/193815905-d499b8ae-6ded-4b39-a4c6-54eaaa5d66d5.png)

##### Image showing many to many  relationship, between course and student in the course class, a different table will be created to show mappings between these values"student_map_course"
![St to course many to many 2022-10-04 042652](https://user-images.githubusercontent.com/78834275/193815951-ab4d489d-0cbb-42b7-a45f-974c04eaac89.png)

#####  Created test cases to test inserting values into the database
![Test cases 2022-10-04 042221](https://user-images.githubusercontent.com/78834275/193815994-4649209c-19b0-4d8e-8f0a-b91ffeb0fa42.png)

##### If you're tring to run the code on yur local machine, change the password, name and db name to that of your database in the application.properties file.

#### Don't forget to drop a star


