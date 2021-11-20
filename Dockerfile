FROM maximilianwollnik/configserver-image

WORKDIR /usr/local/configserver
ADD . .
RUN /bin/bash /usr/local/configserver/gradlew bootJar --no-daemon && \
    cp /usr/local/configserver/build/libs/*.jar $HOME/
WORKDIR $HOME
RUN rm -rf /usr/local/configserver $HOME/.gradle

CMD java -Djava.security.egd=file:/dev/./urandom -jar $HOME/*.jar

