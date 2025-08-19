pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/your-username/your-repo.git', branch: 'main'
            }
        }
        stage('Build WAR with Ant') {
            steps {
                sh 'ant clean war'
            }
        }
        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'dist/*.war', fingerprint: true
            }
        }
        stage('Deploy to Tomcat') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat-creds', url: 'http://your-tomcat-server:8080')],
                       war: 'dist/MyWebApp.war'
            }
        }
    }
}
