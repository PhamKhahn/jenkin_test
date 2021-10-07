/*
pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                retry(3) {
                    sh './flakey-deploy.sh'
                }

                timeout(time: 3, unit: 'MINUTES') {
                    sh './health-check.sh'
                }
            }
        }
    }
}
*/

/*
pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                timeout(time: 3, unit: 'MINUTES') {
                    retry(5) {
                        echo 'Hello world'
                    }
                }
            }
        }
    }
    post {
        always {
            echo "Luon thuc hien"
        }
        success {
            echo "Chay neu success"
        }
        failure {
            echo "chay neu fail"
        }
        unstable {
            echo "Chay neu run duoc mark unstable (khong on dinh)"
        }
        changed {
            echo "Chay neu state cua Pipeline duoc changed"
            echo "VD: neu Pipeline luc truoc fail nhung hien tai thi da success"
        }
    }
}

*/

/*
pipeline {
    agent {
        docker { image 'node:14-alpine' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }

}
*/


pipeline {
    agent any
    environment {
        AGE = 15
        NAME = "Pham Quoc Khanh"
    }
    stages {
        stage('Test') {
            steps {
                echo "My name is ${NAME}"
                echo "My age is ${AGE}"
                sh 'printenv'
            }
        }
    }
}





































