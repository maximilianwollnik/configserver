function prop {
    grep "${1}" gradle.properties|cut -d'=' -f2
}

docker run -d --restart unless-stopped --name configserver --network spring maximilianwollnik/configserver:$(prop 'version')