pipeline {
    agent {
         docker {
              image 'maven:latest' //container will start from this image
              args '-v /root/.m2:/root/.m2' //here you can map local maven repo, this let you to reuse local artifacts
          }
    }

    stages {

       stage ('Compile Stage') {
           steps {
               sh 'mvn clean compile'
           }
       }

       stage ('Testing Stage') {
           steps {
               sh 'mvn test'
           }
       }

    }
}
