# Mobile App Automation Framework

# Installing Appium and dependencies

Clone the repository from Github once you have gained access to it.

***Windows***
- Note down where the jdk is installed on your system and copy the path with the bin folder. Eg. C:\Program Files\Java\jdk1.8.0_144\bin.
- Now, Open Control Panel -> System -> Advanced System Settings -> Environmental Variables -> Click New. Add JAVA_HOME as variable name and paste in the path as the value.
- Open Control Panel -> System -> Advanced System Settings -> Environmental Variables -> Click Edit and add JAVA_HOME to the PATH variable. If a variable named PATH does not exist, then create a new one and add JAVA_HOME to it and save.
- Note down the path where the Android SDK is installed. Repeat the same steps above to add the following to the path variable.
    - Android/sdk
    - Android/sdk/emulator
    - Android/sdk/tools
    - Android/sdk/platform-tools
# Framework organization

The framework is organized into the following components
- **src/main**
  - This package contains all the helper code to setup test configurations, appium server, test utilities etc.
- **src/test/java/com/appiumtests** 
  
  - **pages**: Contains the UI elements of different screens modelled as pages.
  - **test** : This package contains all of our tests described
- **src/test/resources/apps**
  - Contains the  android apps that the framework is going to use to run the  automation on. 

  
