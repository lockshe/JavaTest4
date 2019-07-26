#!/bin/bash

mysql -uroot -p${MYSQL_ROOT_PASSWORD}<<EOF

source /test/sakila-schema.sql
source /test/sakila-data.sql