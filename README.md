#cron_job
## Start
### 1.1 start the backend
```
git clone git@github.com:lsk569937453/java_backend.git
cd java_backend
mvn install
cd target 
java -jar cronJob.jar

```
Then you will see that the program has been started with the port 8096

### 1.2 start the frontend project
```
git clone https://github.com/lsk569937453/rust_frontend

cd rust_frontend

npm install

npm run build
```

### 1.3 copy the dist file to server
```
cd java_backend

mkdir resource
``` 