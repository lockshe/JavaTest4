#bin/bash
mvn clean package -Dmaven.test.skip=true
cp target/mavena.jar docker/java/mavena.jar

