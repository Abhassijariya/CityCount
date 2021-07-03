# CityCount
This Project has spring boot and javascript with the help of both we can find number of cites.

Backend/Server Side technology and coding overview-:
I have created one RestApi in spring Boot, where i will parse my json(cites.txt file in resource folder) retrive city names from there and filter that list of particular letter or word with the help of regex pattern. This is written in java8 where i have used stream api.
after that, i will pass number of counts of cites which matches that letter or word to the client side.
Please NOTE-: i have used lombok project and jackson API, i have included dependecy in POM.xml but you have find difficulty to fetch Lombok depency than you need to 
install it manually where u have put this project in your local system or you can remove one line of code in controller itselt(where you are getting error in log.info() line).

Frontend/ClientSide technology and coding overview-:
I have used HTML,CSS and javascript for designing and developing fronend. In this we have text box where we put letter or word for which we need to find number of cites present in our json(cites.txt) and we get the number of cites below that text box itself.
Please NOTE: In this same respository u will find index.html and myjavascript.js file, please launch index.html once and then u will find your text box in your browser.
