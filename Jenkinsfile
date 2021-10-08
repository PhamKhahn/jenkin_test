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

// Sử dụng env của pipeline. check bằng printenv để xem các env hiện có. 
pipeline {
    agent any
    environment {
        AGE = 15
        NAME = "Pham Quoc Khanh"
        BRANCH_NAME = "dev"
    }
    
    stages {
        stage('Test') {
            steps {
                /* `make check` returns non-zero on test failures,
                * using `true` to allow the Pipeline to continue nonetheless
                */
 
                echo "${currentBuild.result}"
            }
        }

        stage('Test1') {
            steps {
                echo "My name is ${NAME}"
                echo "My age is ${AGE}"
                sh 'printenv'
                echo "${currentBuild.result}"

            }
        }
        stage('Build') {
            steps {
                echo "${BRANCH_NAME}"
                echo "${env.GIT_URL}"
                echo "${env.GIT_BRANCH}"
                echo "${currentBuild.result}"
                when{
                    expression {
                        currentBuild.result == null || currentBuild.result == 'SUCCESS'
                    }
                steps {
                    echo 'EVERYTHING OKE'
                }
                }
            }
        }
    }
}







































