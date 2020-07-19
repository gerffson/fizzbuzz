pipeline {
    agent any

    stages {
        stage('Build') {
            withMaven(){
                steps {
                    sh 'mvn clean compile'
                }
            } 
        }
        stage('Test') {
            withMaven(){
                steps {
                    sh 'mvn test'
                }
            }
        }
    }
}
