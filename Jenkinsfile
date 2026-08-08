pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'java'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'git@github.com:codefeeding99/Testing-and-Builing-using-pipe-line.git',
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
