TestingProject
==============

An example project for different test techniques.

# Dependencies
All dependencies required for building and running the application are included in the maven build file. To build the project you will need

    - Maven
    - SonarQube (http://www.sonarqube.org/) : For static analysis.

# Build
Clone the git repository and run `mvn compile` to build the project.

# Create Debian Installer
Either run `mvn install` which will generate the deb.

# Create RPM Installer (Linux Only)
Go to the pom.xml, uncomment the executions section which looks like:
```
<executions>
    <execution>
        <id>generate-rpm</id>
        <goals>
            <goal>rpm</goal>
        </goals>
    </execution>
</executions>
```
Then run `mvn install` this will generate the installer. This does not work on windows due to rpmbuild not existing.