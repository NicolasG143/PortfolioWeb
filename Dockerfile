FROM amazoncorretto:17

MAINTAINER tuty

COPY target/PortfolioWeb-0.0.1-SNAPSHOT.jar PortfolioWeb-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/PortfolioWeb-0.0.1-SNAPSHOT.jar"]