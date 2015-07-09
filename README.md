U-Equations' first push to GitHub: LCS Jersey RESTful Web App

U-Equations' first push to Github is the classic Longest Common Substring algorithm implemented in a Java-based web application with RESTful Web Services. The implementation is Jersey REST.  The exercise shows use of the javax.json.JsonObject, JsonArray, and JsonValue objects.  These objects are used to store & manipulate form data in JSON format.  The .serializeJson() JavaScript method(referenced below) played a central role in transforming the form data into JSON on the client side before being sent using an ajax request.

Instructions for buliding and running:

Make sure maven is installed on your machine.

1.  cd to the lcs-mensah-webapp folder.

2.  can run web application on a Jetty 9 embedded server with the following command:

mvn clean jetty:run -P embed -e

3.  point browser to the following url:

http://localhost:8090/lcs

reference: https://github.com/marioizquierdo/jquery.serializeJSON
