@Library('abinitio-shared-library') _

pipeline {
    agent any
    triggers{ cron('0 * * * *') }
    stages {
        stage('Node Status') {
            steps {
                script {
                    def nodeResponse = getNodeDetails()

                    if (nodeResponse) {
                        emailext body: "${env.JOB_NAME} - ${env.BUILD_NUMBER} - ${nodeResponse} are offline", subject: 'Nodes Offline', to: 'ESCDOAbinitioJenkins@cba.com.au'
                    }
                }
            }
        }
    }
}
