=====================================================================================
Steps to run from command line :

Make sure you have maven installed and all the required environment variables set.
(Refer : https://maven.apache.org/install.html)

Unzip the commpressed folder.

Move to the folder and start the command prompt.

Command to run : mvn test -Dbrowser=chrome -Denv=PROD

=====================================================================================
Steps to debug from IDE. (Workaround)

Open or import the project as the exisitng maven project.

Goto .\appTest-master\src\test\java\com\appdirect\tests\MyTestCase.java. 

Uncomment @BeforeClass

Run as java application

=====================================================================================
Steps to debug from Eclipse IDE (Actual)

Please follow https://doc.nuxeo.com/display/CORG/How+to+Debug+a+Test+Run+with+Maven

=====================================================================================

