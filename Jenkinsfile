pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'java'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/durgasnv/jenkins.git',
                    credentialsId: 'durgasnv'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Deploy (Optional)') {
            steps {
                echo " Deployment stage (add steps if needed)"
            }
        }
    }
}
