pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: "main", 'https://github.com/ronistr/JenkinsTest.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
