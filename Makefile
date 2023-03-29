.PHONY:

FILES := $(shell docker ps -aq)

local :
	mvn clean package -Dmaven.test.skip
	echo "Starting docker compose ..."
	docker-compose -f infra/base.yml -f infra/kafka.yml -f infra/elastic-search.yml up

stop-all :
	docker stop $(FILES)
	docker rm $(FILES)

clean :
	docker system prune -f

logs-local :
	docker logs -f $(FILES)