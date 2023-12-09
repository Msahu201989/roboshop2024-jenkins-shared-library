def call() {
    node {

        common.codeQuality()


            if ( branch == "main" || tag ==~ "*") {
               stage('Style Checks') {
                 echo 'Code Quality'
               }
            }



//            stage('Unit Tests') {
//                steps {
//                    echo 'Unit tests'
//                }
//            }

//            stage('Download Dependencies') {
//                steps {
//                    echo 'Download Dependencies'
//                }
//            }
//
//            stage('Prepare Artifact') {
//                steps {
//                    echo 'Prepare Artifact'
//                }
//            }
//
//            stage('Publish Artifact') {
//                steps {
//                    echo 'Publish Artifact'
//                }
//            }
       }
  }
