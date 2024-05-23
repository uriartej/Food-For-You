# Food Choices For You
This project will help the user choose on what fast food they would want to eat by choosing
a set of options. The set of options includes healthy, weight gain, or protein. For example,
if the user is feeling healthy, the user would have to choose healthy mode which will help the 
user eat a healthy related item. 

## Prerequisites
Java JDK 17.0.10 or higher

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

### Current Progress
So far the programs allows the user to input a restaurant, the program
then outputs the list of fast food items from the specific restaurant.
If restaurant is not in the list, it will display "Restaurant Not Found."

Update:
I added a boolean method named isItemMatchingChoice that takes parameters
of the item, and the choice. The choices are utlized by using a switch 
statement from one to three. The first choice is healthy, second is weight
gain, and third is protein. All these choices are fetched through the items
description by using specific words such as healthy, weight gain, protein to
name a few. If the item description contains any of these words, then the item
would be displays by the user's choice. The next step of this project is to
create the frontend. 

