This project implement GoFo system which allow anyone who has playground to register in the system and any football player can register and book this playground in certain hours whenever he want with his own team or even search for a team in the system which needs player to be ready to play, in addition to some more features.
This system has 3 packages GoFoSystem, playerContent  and playgroundOwnerContent.
GoFoSystem has 4 classes
	-Administrator which hold all the administrator data beside the functions that the administrator could do in the system.
	-Date which is responsible for storing the full date of the reservation in hours, minutes, day, month and year.
	-GoFo which holds the actions that the administrator can do to add playground or remove it from the system in addition to the player registration.
	-User which hold the users inforamation in the system.
playerContent  has 2 classes
	-Favourite team which holds the names and the emails of every player favourite team to allow him to send them invitation whenever he wants easier.
	-Player which have the features that allow any player in the system to book a playground or view the playgrounds that he have already booked.
playgroundOwnerContent has 4 classes
	-Book have the book inforamtion (number of players, the playground, price) and also set the status of the playground whether accepted from the administrator to be added to the system, or still waiting for his response or even refused by him.
	-Location which holds the location of the playground (street and city)
	-Playground which have the information of the playground and actions that control it.
	-PlaygroundOwner which have the information of the playground owner and give him the feature of accepting or refusing every certain book to his playgrounds.
This project is written by java, we used intellij IDEA to write the implementation, in addition to visual paradigm to draw the class, sequence and state diagrams before the implementation to help us in planning the system easier.