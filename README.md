# Food Choices For You
This project will help the user choose on what fast food they would want to eat by choosing
a set of options. The set of options includes healthy, weight gain, or protein. For example,
if the user is feeling healthy, the user would have to choose healthy mode which will help the 
user eat a healthy related item. The user will also have flexibility by incorporating a variety
of choices. The following choices are _view restaurant menu_, _add restaurant_, _update restaurant_,
_delete restaurant_, _add menu item_, and _remove menu item_. 

## Resources and Dependencies

### Programming Language
- **Java** (version 18)

### Frameworks and Libraries
1. **Spring Boot** (version 2.7.0)
   - Spring Boot Start Web
   - Spring Boot Starter Data JPA

2. **Database**
   - H2 Database (version 2.1.214)

3. **Utilities**
   - Lombok (version 1.18.24)

4. **Testing Frameworks**
   - Spring Boot Starter Test (version 2.7.0)
   - JUnit Jupiter API (version 5.8.2)
   - JUnit Jupiter Engine (version 5.8.2)
   - Mockito Core (version 4.5.1)
   - Mockito JUnit Jupiter (version 4.5.1)

5. **XML Binding**
   - JAXB API (verison 2.3.1)
   - JAXB Runtime (version 2.3.1)

### Plugins
   - Spring Boot Maven Plugin (version 2.7.0)
   - Maven Compiler Plugin (version 3.8.1)

## Installation Procedures

### Installation for macOS and Linux
1. Clone the project repository:
   git clone https://github.com/uriartej/Food-For-You.git
2. Navigate to the project directory: 
   cd Food-Choices-For-You
3. Compile the project:
   javac -d out/production/Food\ Choices\ For\ You src/*.java
4. Run the application:
   java -cp out/production/Food\ Choices\ For\ You Main
### Installation for Windows
1. Clone the project repository:
   git clone https://github.com/uriartej/Food-For-You.git
2. Navigate to the project directory:
   cd Food-Choices-For-You
3. Compile the project:
   javac -d out\production\Food Choices For You src\*.java
4. Run the application:
   java -cp out\production\Food Choices For You Main

## Current Progress
So far the programs allows the user to input a restaurant, the program then outputs the list
of fast food items from the specific restaurant. If restaurant is not in the list, it will 
display "Restaurant Not Found."

_**Update**_:
I added a boolean method named isItemMatchingChoice that takes parameters of the item, and the
choice. The choices are utlized by using a switch statement from one to three. The first choice
is healthy, second is weight gain, and third is protein. All these choices are fetched through
the items description by using specific words such as healthy, weight gain, protein to name a few.
If the item description contains any of these words, then the item would be displays by the user's
choice. The next step of this project is to create the frontend.

_**Update**_:
Recorganized the files into one package. The name of the package is com.foodapp.foodforyou. All 
files have the same package. Renamed Main.java to Output.java.

_**Update**_: 
Added more options for the user to choose from such as _view restuarant_, _add__restaurant_, _update 
restaurant_, _delete restaurant_, _add menu item_ and _remove menu item_ by editing Output.java file.
I edited RestaurantDatabase.java file by adding methods to support the user to choose more options. 
Also, added a database intilization method. I began setting up the development environment by choosing
Maven as my build tool. Created a pom.xml file with the neccessary dependancies to start on the backend 
using Spring Boot. 

_**Update**_:
Started on the backend. The first file created is FoodForYouApplication where it would handle the 
start-up application process for the project. Then I created RestaurantController to handle HTTP requests
and preform CRUD operations on restaurants and menu items. The controller methods are @GetMapping, @Post
Mapping, @PutMapping, and @DeleteMapping. The methods also return HTTP statuses. 

_**Update**_:
Created a test folder that contains RestaurantControllerTest, RestaurantDatabaseTest, and RestaurantTest java
files. Each of these folders are for automated testing. All test cases passed. Incorporated Maven into 
the project with the dependencies shown above. All test cases passed. Throughout having test cases passed, I 
was having trouble having test cases passed through individual methods due to having my test folder labled as
a source folder. I was able to solve this by focusing my attention to the IDE because it's where my test cases
were failing rather than using the terminal using Maven.

_**Update**_:
Ran mvn spring-boot:run on terminal and recieved a list of restaurants for http://localhost:8080/restaurants.
Will check the rest of the api endpoints and make sure they are working properly.


![Screenshot from 2024-05-31 10-34-51](https://github.com/uriartej/Food-For-You/assets/99374424/b0f80504-40dd-4761-b6f1-0c87585b79ab)
![Screenshot from 2024-06-03 18-20-21](https://github.com/uriartej/Food-For-You/assets/99374424/94a10cc8-f734-4e63-b0a7-7b48fc1144ef)
![Screenshot from 2024-06-04 17-17-22](https://github.com/uriartej/Food-For-You/assets/99374424/a8017565-a19c-4b0f-8c65-a5320fed1e22)


