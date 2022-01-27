mvn spring-boot:run

mvn verify

en premiere test unitaire et apres test integration



mvn package -Dmaven.test.skip=true

mvn verify -Dskip.it=true

mvn -DskipTests=true


mvn project -Profilname