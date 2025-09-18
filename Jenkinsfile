pipeline {
    agent any

    tools {
      maven "M3"
    }

    stages {
        stage('Hello') {
            steps {
                sh "mvn clean test"
            }
        }
    }
}