FROM registry.saas.hand-china.com/tools/mysql:5.6
  
MAINTAINER yzj "yeah_59@126.com"
# 添加 
COPY sakila-schema.sql /test/sakila-schema.sql
COPY sakila-data.sql /test/sakila-data.sql
COPY setup.sh /docker-entrypoint-initdb.d/setup.sh
RUN chmod a+x /docker-entrypoint-initdb.d/setup.sh
