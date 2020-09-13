There is a common versioning practice in software management world - “Semantic Versioning”. Consider a version format of X.Y.Z (Major.Minor.Patch). Bug fixes not affecting the API increment the patch version, backwards compatible API additions/changes increment the minor version, and backwards incompatible API changes increment the major version. Under this scheme, version numbers and the way they change convey meaning about the underlying code and what has been modified from one version to the next.

In this task you will be given a git repository located at /root/devops/someRepo, you need to:

Find out its current version based on the latest git tag.
Then you should determine if the last update is a major, a minor, or a patch update. You can determine it by querying to an API with url http://localhost:8888/update. A GET request to that url will retrieve "patch", "minor" or "major".
Modify the deploy.yml file with the new version. The value latestImage should be updated.
Finally you should create a new git lightweight tag based on the new version.
The final output of your program should be the new deploy.yml file and the command used to create the git tag.

Example



The content of deploy.yml is

appName: myProject
latestImage: v0.0.0
services:
  webapp:
    build:
      context: ./dir
      dockerfile: Dockerfile-alternate
      args:
        buildno: 1
  microservice: www.example.com/api
The latest git tag is named v0.1.3, thus the project was subject to 1 minor update along with 3 followed patch updates. Assume the API responds "minor" i.e. the next update is a minor update. Therefore the new version should increment the minor version and reset the patch version yielding v0.2.0.

The output should contain the contents of deploy.yml and the git tag command.

appName: myProject
latestImage: v0.2.0
services:
  webapp:
    build:
      context: ./dir
      dockerfile: Dockerfile-alternate
      args:
        buildno: 1
  microservice: www.example.com/api
git tag v0.2.0
[execution time limit] 15 seconds (java)