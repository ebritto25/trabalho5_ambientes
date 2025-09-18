pipeline {
    agent any

    tools {
      maven "M3"
    }

    stages {
        stage('test') {
            steps {
                sh "mvn clean test"
            }
        }
        stage('build') {
            steps {
              sh "mvn clean install"
            }
        }
    }
}