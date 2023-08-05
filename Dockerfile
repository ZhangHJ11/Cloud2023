# 使用的基础镜像
FROM openjdk:17-jdk-slim

# 将工作目录设置为 /app
WORKDIR /app

# 将本地的jar文件拷贝到容器中的/app目录
COPY target/nju16-0.0.1-SNAPSHOT.jar /app/nju16-0.0.1-SNAPSHOT.jar

# 设置启动命令
CMD ["java", "-jar", "nju16-0.0.1-SNAPSHOT.jar"]
