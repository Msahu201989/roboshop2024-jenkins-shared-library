def call() {
    pipeline {

        agent {
            node 'Workstation'
        }

        stages {

            stage('Code Quality') {
                steps {
                    echo 'Code Quality'
                }
            }

            stage('Style Checks') {
                steps {
                    echo 'Code Quality'
                }
            }

            stage('Unit Tests') {
                steps {
                    echo 'Unit tests'
                }
            }

            stage('Prepare Artifact') {
                steps {
                    echo 'Prepare Artifact'
                }
            }

            stage('Publish Artifact') {
                steps {
                    echo 'Publish Artifact'
                }
            }
        }
    }
}