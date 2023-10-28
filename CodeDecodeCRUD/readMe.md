This project is for the SpringBoot hibernate, CRUD, JAP
File Structure(Make sure to create a seperate package for Entity/Controller/Service/Repos)

Note:-Always navigate through service and service to repos

1- Employee.Java
------------------
This will have all fields of db that need to be used for CRUD
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
class <name>
@Id
@--all validations
---------------------
2- Repos its an interface that extend JPS/CRUD Repository
This will have all CRUD operation that will be extended by JPARepository
@Repository
----------------
3- Service
 ---------
 This is have the logic of what/when/how to retrieve DB
 @Service
----------------
4- Controller
 ------------
 This will have all endpoints for req/resp
 @RestController
@RequestMapping("/code")
@Get/postmapping

Create a Autowired Repos and call JPA methods like finAll/findById
-------------

----------
5-Add all DB properties in application.properties related to 
db drives/url/user/pass
all JPA prperties like show-sql/hybernate dialect/ddle-auto