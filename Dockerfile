FROM nexus.laowengs.com:8082/jdk/openjdk:8u332-slim-buster
WORKDIR /root
COPY target/ms-proxy-gateway-*.jar /app/ms-proxy-gateway.jar
COPY apm /app/apm

CMD ["java", \
     "-XX:InitialRAMPercentage=50.0", "-XX:MaxRAMPercentage=50.0", \
     "-XX:+UseG1GC", "-XX:+HeapDumpOnOutOfMemoryError", \
     "-javaagent:/app/apm/skywalking-agent.jar -DSW_AGENT_NAME=ms-proxy-gateway -DSW_AGENT_COLLECTOR_BACKEND_SERVICES=192.168.3.21:11800 ",\
     "-jar", "/app/ms-proxy-gateway.jar"]
