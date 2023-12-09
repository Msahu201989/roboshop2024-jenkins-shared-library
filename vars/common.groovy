def codeQuality() {
    stage('Code Quality') {
            echo 'Code Quality'
            sh 'env'
    }
}

def codeChecks() {
    if ( BRANCH_NAME == "main" || TAG_NAME ==~ ".*") {
        stage('Style Checks') {
            echo 'Style Checks'
        }

        stage('Unit Tests') {
                echo 'Unit tests'
            }
        }

    }

def artifacts() {
    if ( TAG_NAME ==~ ".*") {

       stage('Download Dependencies') {
         echo 'Download Dependencies'
                }
       stage('Prepare Artifacts') {
           echo 'Prepare artifacts'
       }

       stage('Publish Artifacts') {
           echo 'Publish Artifacts'
       }

    }
}