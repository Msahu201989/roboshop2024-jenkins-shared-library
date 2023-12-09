def call() {
    pipeline {

        agent any

        stages {

            stage('Compile Code'){
                steps {
                    echo 'Compile Code'
                }
            }

            stage('Code Quality') {
                steps {
                    echo 'Code Quality'
                }
            }

            stage('Style Checks') {
                steps {
                    echo 'Style Checks'
                }
            }

            stage('Unit Tests') {
                steps {
                    echo 'Unit tests'
                }
            }

            stage('Build Packages') {
                steps {
                    echo 'Download Dependencies'
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