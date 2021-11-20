function prop {
    grep "${1}" gradle.properties|cut -d'=' -f2
}

docker build -t maximilianwollnik/configserver .
docker tag maximilianwollnik/configserver:latest maximilianwollnik/configserver:$(prop 'version')