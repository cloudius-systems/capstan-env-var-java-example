# Capstan Java example project

This is an extended example [Capstan](https://github.com/cloudius-systems/capstan)
project for building and running Java applications on
[OSv](http://osv.io/).

Unlike the
[simple Java example](https://github.com/cloudius-systems/capstan-example-java),
this example demonstrate setting local(static) and remote (dynamic, from cloud-init) environment variables.

## Prerequisites
* [Capstan](https://github.com/cloudius-systems/capstan)


## Run
``` sh
capstan run 
```

## What is in the example
* local-init.yaml - an example local init file, with sets a env var:
  **my_var**, and call (using include) the remote init file

* remote-init.yaml - an example of a cloud-init file, setting an env
  var **cloud_var**

* src/main/java/io/osv/Main.java - a trivial Java program which use
  both env vars

* cmdline - osv init file which call the local init file

* Capstanfile which upload all of the above files to the image

To test the remote-init file locally, you will need to run
[ec2-simulator](https://github.com/cloudius-systems/osv/blob/master/scripts/ec2-simulator.py)
from the osv source code:
```
sudo ./scripts/ec2-simulator.py -f ~/projects/capstan-example-java/remote-init.yaml
```
The simulator position the remote-init.yaml in the standard meta-data
IP, 169.254.169.254, as EC2 does.


