#!/usr/bin/make
SHELL=/bin/bash
RUN_APP_ARGS = --rm --user "$(shell id -u):$(shell id -g)"

.DEFAULT_GOAL := help
.PHONY: help

help: ## Show this help
	@printf "\033[33m%s:\033[0m\n" 'Available commands'
	@awk 'BEGIN {FS = ":.*?## "} /^[a-zA-Z_-]+:.*?## / {printf "  \033[32m%-14s\033[0m %s\n", $$1, $$2}' $(MAKEFILE_LIST)

build: ## Docker image build
	echo "Docker image building..."
	docker build -t royalwang/maven-build-jdk11:spring-boot-2.3.12 -f Dockerfile ../

push: ## Docker image push
	echo "Docker image pushing..."
	docker push royalwang/maven-build-jdk11:spring-boot-2.3.12
