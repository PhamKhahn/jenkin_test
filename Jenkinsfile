
env.buildCmd = """
    mvn -U clean install
"""


pipeline {
    parameter {
        choice(name: 'env.JAVA_HOME', choices: ['JDK 8', 'JDK 7', 'JDK 11'], description: 'Choose Version JDK')
    }
    agent any
    stages {
        stage('Build') {
            echo "OKe"
    }
        }
    }
}