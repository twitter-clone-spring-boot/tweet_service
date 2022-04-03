FROM mysql:5.7
ADD . /docker-entrypoint-initdb.d

# We are adding everything from . to /docker-entryoint-initdb.
# It copies all the scripts we have, and run those scripts inside the docker container after starting mysql server