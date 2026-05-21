MONOLITH:
mvn spring-boot:run

MICROSERVICES:
mvn clean package (for each microservice)
docker-compose up --build
docker-compose down (to close)
